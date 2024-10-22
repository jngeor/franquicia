package pe.com.franquicia.model.producto.gateways;

import pe.com.franquicia.model.producto.Producto;
import reactor.core.publisher.Mono;

public interface ProductoRepository {
    Mono<Producto> insertProducto(String nombre);
    Mono<Producto> updateProducto(Producto producto);
}
