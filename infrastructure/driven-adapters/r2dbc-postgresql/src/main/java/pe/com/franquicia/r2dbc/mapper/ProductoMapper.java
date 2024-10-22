package pe.com.franquicia.r2dbc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.com.franquicia.model.producto.Producto;
import pe.com.franquicia.r2dbc.entity.ProductoData;

@Mapper
public interface ProductoMapper {
    ProductoMapper MAPPER = Mappers.getMapper(ProductoMapper.class);

    Producto toDomain(ProductoData data);

    ProductoData toData(Producto domain);
}
