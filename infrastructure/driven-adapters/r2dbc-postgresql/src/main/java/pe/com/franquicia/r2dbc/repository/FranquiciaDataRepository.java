package pe.com.franquicia.r2dbc.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import pe.com.franquicia.r2dbc.entity.FranquiciaData;

public interface FranquiciaDataRepository extends R2dbcRepository<FranquiciaData, String> {
}
