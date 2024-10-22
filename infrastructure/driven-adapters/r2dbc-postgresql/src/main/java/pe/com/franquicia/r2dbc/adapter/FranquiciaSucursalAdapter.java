package pe.com.franquicia.r2dbc.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.com.franquicia.model.franquiciasucursal.FranquiciaSucursal;
import pe.com.franquicia.model.franquiciasucursal.gateways.FranquiciaSucursalRepository;
import pe.com.franquicia.r2dbc.entity.FranquiciaSucursalData;
import pe.com.franquicia.r2dbc.mapper.FranquiciaSucursalMapper;
import pe.com.franquicia.r2dbc.repository.FranquiciaSucursalDataRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class FranquiciaSucursalAdapter implements FranquiciaSucursalRepository {
    private final FranquiciaSucursalDataRepository franquiciaSucursalDataRepository;

    @Override
    public Mono<FranquiciaSucursal> insertFranquiciaSucursal(FranquiciaSucursal franquiciaSucursal) {
        return franquiciaSucursalDataRepository.save(buildFranquiciaSucursalData(franquiciaSucursal))
                .map(FranquiciaSucursalMapper.MAPPER::toDomain);
    }

    private FranquiciaSucursalData buildFranquiciaSucursalData(FranquiciaSucursal franquiciaSucursal) {
        return FranquiciaSucursalData.builder()
                .uuId(UUID.randomUUID().toString())
                .uuIdFranquicia(franquiciaSucursal.getUuIdFranquicia())
                .uuIdSucursal(franquiciaSucursal.getUuIdSucursal())
                .build();
    }
}
