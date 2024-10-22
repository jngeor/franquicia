package pe.com.franquicia.usecase.sucursal;

import lombok.RequiredArgsConstructor;
import pe.com.franquicia.model.sucursal.Sucursal;
import pe.com.franquicia.model.sucursal.gateways.SucursalRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class SucursalUseCase {
    private final SucursalRepository sucursalRepository;

    public Mono<Sucursal> insertSucursal(String nombre){
        return sucursalRepository.insertSucursal(nombre);
    }

    public Mono<Sucursal> updateSucursaal(Sucursal sucursal) {
        return sucursalRepository.updateSucursaal(sucursal);
    }
}
