package pe.com.franquicia.model.sucursal.gateways;

import pe.com.franquicia.model.sucursal.Sucursal;
import reactor.core.publisher.Mono;

public interface SucursalRepository {
    Mono<Sucursal> insertSucursal(String nombre);
    Mono<Sucursal> updateSucursaal(Sucursal sucursal);
}
