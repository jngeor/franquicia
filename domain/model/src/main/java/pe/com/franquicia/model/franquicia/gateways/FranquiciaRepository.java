package pe.com.franquicia.model.franquicia.gateways;

import pe.com.franquicia.model.franquicia.Franquicia;
import reactor.core.publisher.Mono;

public interface FranquiciaRepository {
    Mono<Franquicia> insertFranquicia(String nombre);
    Mono<Franquicia> updateFranquicia(Franquicia franquicia);
}
