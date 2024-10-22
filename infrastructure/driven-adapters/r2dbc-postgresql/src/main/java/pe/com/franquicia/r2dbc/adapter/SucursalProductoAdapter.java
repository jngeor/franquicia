package pe.com.franquicia.r2dbc.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.com.franquicia.model.sucursalproducto.SucursalProducto;
import pe.com.franquicia.model.sucursalproducto.gateways.SucursalProductoRepository;
import pe.com.franquicia.r2dbc.entity.SucursalProductoData;
import pe.com.franquicia.r2dbc.mapper.SucursalProductoMapper;
import pe.com.franquicia.r2dbc.repository.SucursalProductoDataRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class SucursalProductoAdapter implements SucursalProductoRepository {
    private final SucursalProductoDataRepository sucursalProductoDataRepository;


    @Override
    public Mono<SucursalProducto> insertSucursalProducto(SucursalProducto sucursalProducto) {
        return sucursalProductoDataRepository.save(buildSucursalProductodata(sucursalProducto))
                .map(SucursalProductoMapper.MAPPER::toDomain);
    }

    @Override
    public Mono<SucursalProducto> updateProducto(SucursalProducto sucursalProducto) {
        return sucursalProductoDataRepository.save(SucursalProductoMapper.MAPPER.toData(sucursalProducto))
                .map(SucursalProductoMapper.MAPPER::toDomain);
    }

    @Override
    public Mono<Void> deleteSucursalProducto(SucursalProducto sucursalProducto) {
        return sucursalProductoDataRepository.delete(SucursalProductoMapper.MAPPER.toData(sucursalProducto));
    }

    private SucursalProductoData buildSucursalProductodata(SucursalProducto sucursalProducto) {
        return SucursalProductoData.builder()
                .uuId(UUID.randomUUID().toString())
                .uuIdFranquicia(sucursalProducto.getUuIdFranquicia())
                .uuIdSucursal(sucursalProducto.getUuIdSucursal())
                .uuIdProducto(sucursalProducto.getUuIdProducto())
                .build();
    }
}
