package pe.com.franquicia.r2dbc.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.com.franquicia.model.producto.Producto;
import pe.com.franquicia.model.producto.gateways.ProductoRepository;
import pe.com.franquicia.r2dbc.entity.ProductoData;
import pe.com.franquicia.r2dbc.mapper.ProductoMapper;
import pe.com.franquicia.r2dbc.repository.ProductoDataRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class ProductoAdapter implements ProductoRepository {
    private final ProductoDataRepository productoDataRepository;

    @Override
    public Mono<Producto> insertProducto(String nombre) {
        return productoDataRepository.save(builProductoData(nombre))
                .map(ProductoMapper.MAPPER::toDomain);
    }

    @Override
    public Mono<Producto> updateProducto(Producto producto) {
        return productoDataRepository.save(ProductoMapper.MAPPER.toData(producto))
                .map(ProductoMapper.MAPPER::toDomain);
    }

    private ProductoData builProductoData(String nombre) {
        return ProductoData.builder()
                .uuId(UUID.randomUUID().toString())
                .nombre(nombre)
                .build();
    }
}
