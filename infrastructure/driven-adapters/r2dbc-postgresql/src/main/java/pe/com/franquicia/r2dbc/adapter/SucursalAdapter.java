package pe.com.franquicia.r2dbc.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.com.franquicia.model.sucursal.Sucursal;
import pe.com.franquicia.model.sucursal.gateways.SucursalRepository;
import pe.com.franquicia.r2dbc.entity.SucursalData;
import pe.com.franquicia.r2dbc.mapper.SucursalMapper;
import pe.com.franquicia.r2dbc.repository.SucursalDataRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class SucursalAdapter implements SucursalRepository {
    private final SucursalDataRepository sucursalDataRepository;

    @Override
    public Mono<Sucursal> insertSucursal(String nombre) {
        return sucursalDataRepository.save(buildSucursalData(nombre))
                .map(SucursalMapper.MAPPER::toDomain);
    }

    @Override
    public Mono<Sucursal> updateSucursaal(Sucursal sucursal) {
        return sucursalDataRepository.save(SucursalMapper.MAPPER.toData(sucursal))
                .map(SucursalMapper.MAPPER::toDomain);
    }

    private SucursalData buildSucursalData(String nombre) {
        return SucursalData.builder()
                .uuId(UUID.randomUUID().toString())
                .nombre(nombre)
                .build();
    }
}
