package pe.com.franquicia.r2dbc.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.com.franquicia.model.franquicia.Franquicia;
import pe.com.franquicia.model.franquicia.gateways.FranquiciaRepository;
import pe.com.franquicia.r2dbc.entity.FranquiciaData;
import pe.com.franquicia.r2dbc.mapper.FranquiciaMapper;
import pe.com.franquicia.r2dbc.repository.FranquiciaDataRepository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
@Component
public class FranquiciaAdapter implements FranquiciaRepository {

    private final FranquiciaDataRepository franquiciaDataRepository;

    @Override
    public Mono<Franquicia> insertFranquicia(String nombre) {
        return franquiciaDataRepository.save(buildFranquiciaData(nombre))
                .map(FranquiciaMapper.MAPPER::dataToDomain);
    }

    @Override
    public Mono<Franquicia> updateFranquicia(Franquicia franquicia) {
        return franquiciaDataRepository.save(FranquiciaMapper.MAPPER.domainToData(franquicia))
                .map(FranquiciaMapper.MAPPER::dataToDomain);
    }

    private FranquiciaData buildFranquiciaData(String nombre) {
        return FranquiciaData.builder()
                .uuId(UUID.randomUUID().toString())
                .nombre(nombre)
                .build();
    }
}
