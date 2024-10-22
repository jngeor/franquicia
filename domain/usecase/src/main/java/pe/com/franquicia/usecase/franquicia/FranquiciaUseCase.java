package pe.com.franquicia.usecase.franquicia;

import lombok.RequiredArgsConstructor;
import pe.com.franquicia.model.franquicia.Franquicia;
import pe.com.franquicia.model.franquicia.gateways.FranquiciaRepository;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class FranquiciaUseCase {
    private final FranquiciaRepository franquiciaRepository;

    public Mono<Franquicia> insertFranquicia(String nombre) {
        return franquiciaRepository.insertFranquicia(nombre);
    }

    public Mono<Franquicia> updateFranquicia(Franquicia franquicia) {
        return franquiciaRepository.updateFranquicia(franquicia);
    }
}
