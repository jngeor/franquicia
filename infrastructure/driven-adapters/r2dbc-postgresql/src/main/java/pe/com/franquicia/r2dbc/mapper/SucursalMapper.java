package pe.com.franquicia.r2dbc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.com.franquicia.model.sucursal.Sucursal;
import pe.com.franquicia.r2dbc.entity.SucursalData;

@Mapper
public interface SucursalMapper {
    SucursalMapper MAPPER = Mappers.getMapper(SucursalMapper.class);

    Sucursal toDomain(SucursalData data);

    SucursalData toData(Sucursal domain);
}
