package pe.com.franquicia.model.sucursalproducto.gateways;

import pe.com.franquicia.model.sucursalproducto.SucursalProducto;
import reactor.core.publisher.Mono;

public interface SucursalProductoRepository {
    Mono<SucursalProducto> insertSucursalProducto(SucursalProducto sucursalProducto);
    Mono<SucursalProducto> updateProducto(SucursalProducto sucursalProducto);
    Mono<Void> deleteSucursalProducto(SucursalProducto sucursalProducto);
}
