package pe.com.franquicia.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.com.franquicia.api.dto.NameRequest;
import pe.com.franquicia.model.franquicia.Franquicia;
import pe.com.franquicia.model.franquiciasucursal.FranquiciaSucursal;
import pe.com.franquicia.model.producto.Producto;
import pe.com.franquicia.model.sucursal.Sucursal;
import pe.com.franquicia.model.sucursalproducto.SucursalProducto;
import pe.com.franquicia.usecase.franquicia.FranquiciaUseCase;
import pe.com.franquicia.usecase.franquiciasucursal.FranquiciaSucursalUseCase;
import pe.com.franquicia.usecase.producto.ProductoUseCase;
import pe.com.franquicia.usecase.sucursal.SucursalUseCase;
import pe.com.franquicia.usecase.sucursalproducto.SucursalProductoUseCase;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private final FranquiciaUseCase franquiciaUseCase;
    private final SucursalUseCase sucursalUseCase;
    private final ProductoUseCase productoUseCase;
    private final FranquiciaSucursalUseCase franquiciaSucursalUseCase;
    private final SucursalProductoUseCase sucursalProductoUseCase;

    public Mono<ServerResponse> insertFranquicia(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(NameRequest.class)
                .flatMap(nameRequest -> franquiciaUseCase.insertFranquicia(nameRequest.getName())
                        .flatMap(franquicia -> ServerResponse.ok().bodyValue(franquicia)));
    }

    public Mono<ServerResponse> updateFranquicia(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Franquicia.class)
                .flatMap(franquiciaRequest -> franquiciaUseCase.updateFranquicia(franquiciaRequest)
                        .flatMap(franquicia -> ServerResponse.ok().bodyValue(franquicia)));
    }

    public Mono<ServerResponse> insertSucursal(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(NameRequest.class)
                .flatMap(nameRequest -> sucursalUseCase.insertSucursal(nameRequest.getName())
                        .flatMap(sucursal -> ServerResponse.ok().bodyValue(sucursal)));
    }

    public Mono<ServerResponse> updateSucursal(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Sucursal.class)
                .flatMap(sucursalRequest -> sucursalUseCase.updateSucursaal(sucursalRequest)
                        .flatMap(sucursal -> ServerResponse.ok().bodyValue(sucursal)));
    }

    public Mono<ServerResponse> insertProducto(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(NameRequest.class)
                .flatMap(nameRequest -> productoUseCase.insertProducto(nameRequest.getName())
                        .flatMap(producto -> ServerResponse.ok().bodyValue(producto)));
    }

    public Mono<ServerResponse> updateProducto(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Producto.class)
                .flatMap(productoRequest -> productoUseCase.updateProducto(productoRequest)
                        .flatMap(producto -> ServerResponse.ok().bodyValue(producto)));
    }

    public Mono<ServerResponse> insertFranquiciaSucursal(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(FranquiciaSucursal.class)
                .flatMap(request -> franquiciaSucursalUseCase.insertFranquiciaSucursal(request)
                        .flatMap(franquiciaSucursal -> ServerResponse.ok().bodyValue(franquiciaSucursal)));
    }

    public Mono<ServerResponse> insertSucursalProducto(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(SucursalProducto.class)
                .flatMap(request -> sucursalProductoUseCase.insertSucursalProducto(request)
                        .flatMap(sucursalProducto -> ServerResponse.ok().bodyValue(sucursalProducto)));
    }

    public Mono<ServerResponse> deleteSucursalProducto(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(SucursalProducto.class)
                .flatMap(request -> sucursalProductoUseCase.deleteSucursalProducto(request)
                        .flatMap(sucursalProducto -> ServerResponse.ok().bodyValue(sucursalProducto)));
    }

    public Mono<ServerResponse> updateSucursalProducto(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(SucursalProducto.class)
                .flatMap(request -> sucursalProductoUseCase.updateProducto(request)
                        .flatMap(sucursalProducto -> ServerResponse.ok().bodyValue(sucursalProducto)));
    }

}
