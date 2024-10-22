package pe.com.franquicia.r2dbc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.com.franquicia.model.sucursalproducto.SucursalProducto;
import pe.com.franquicia.r2dbc.entity.SucursalProductoData;

@Mapper
public interface SucursalProductoMapper {
    SucursalProductoMapper MAPPER = Mappers.getMapper(SucursalProductoMapper.class);

    SucursalProducto toDomain(SucursalProductoData data);

    SucursalProductoData toData(SucursalProducto domain);
}
