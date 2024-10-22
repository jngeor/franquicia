package pe.com.franquicia.r2dbc.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import pe.com.franquicia.r2dbc.entity.SucursalData;

public interface SucursalDataRepository extends R2dbcRepository<SucursalData, String> {
}
