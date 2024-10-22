package pe.com.franquicia.usecase.franquiciasucursal;

import lombok.RequiredArgsConstructor;
import pe.com.franquicia.model.franquiciasucursal.FranquiciaSucursal;
import pe.com.franquicia.model.franquiciasucursal.gateways.FranquiciaSucursalRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class FranquiciaSucursalUseCase {
    private final FranquiciaSucursalRepository franquiciaSucursalRepository;

    public Mono<FranquiciaSucursal> insertFranquiciaSucursal(FranquiciaSucursal franquiciaSucursal) {
        return franquiciaSucursalRepository.insertFranquiciaSucursal(franquiciaSucursal);
    }
}
