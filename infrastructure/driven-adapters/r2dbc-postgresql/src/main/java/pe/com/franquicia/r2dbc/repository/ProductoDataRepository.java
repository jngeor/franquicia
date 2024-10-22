package pe.com.franquicia.r2dbc.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import pe.com.franquicia.r2dbc.entity.ProductoData;

public interface ProductoDataRepository extends R2dbcRepository<ProductoData, String> {
}
