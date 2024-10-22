package pe.com.franquicia.usecase.sucursalproducto;

import lombok.RequiredArgsConstructor;
import pe.com.franquicia.model.sucursalproducto.SucursalProducto;
import pe.com.franquicia.model.sucursalproducto.gateways.SucursalProductoRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SucursalProductoUseCase {
    private final SucursalProductoRepository sucursalProductoRepository;

    public Mono<SucursalProducto> insertSucursalProducto(SucursalProducto sucursalProducto) {
        return sucursalProductoRepository.insertSucursalProducto(sucursalProducto);
    }

    public Mono<SucursalProducto> updateProducto(SucursalProducto sucursalProducto) {
        return sucursalProductoRepository.updateProducto(sucursalProducto);
    }

    public Mono<Void> deleteSucursalProducto(SucursalProducto sucursalProducto) {
        return sucursalProductoRepository.deleteSucursalProducto(sucursalProducto);
    }
}
