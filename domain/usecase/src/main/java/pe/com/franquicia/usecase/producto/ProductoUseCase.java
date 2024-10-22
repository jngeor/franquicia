package pe.com.franquicia.usecase.producto;

import lombok.RequiredArgsConstructor;
import pe.com.franquicia.model.producto.Producto;
import pe.com.franquicia.model.producto.gateways.ProductoRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class ProductoUseCase {
    private final ProductoRepository productoRepository;

    public Mono<Producto> insertProducto(String nombre) {
        return productoRepository.insertProducto(nombre);
    }

    public Mono<Producto> updateProducto(Producto producto) {
        return productoRepository.updateProducto(producto);
    }
}
