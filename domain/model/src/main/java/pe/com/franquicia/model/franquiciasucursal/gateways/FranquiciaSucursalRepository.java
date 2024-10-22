package pe.com.franquicia.model.franquiciasucursal.gateways;

import pe.com.franquicia.model.franquiciasucursal.FranquiciaSucursal;
import reactor.core.publisher.Mono;

public interface FranquiciaSucursalRepository {
    Mono<FranquiciaSucursal> insertFranquiciaSucursal(FranquiciaSucursal franquiciaSucursal);
}
