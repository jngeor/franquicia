package pe.com.franquicia.r2dbc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.com.franquicia.model.franquiciasucursal.FranquiciaSucursal;
import pe.com.franquicia.r2dbc.entity.FranquiciaSucursalData;

@Mapper
public interface FranquiciaSucursalMapper {
    FranquiciaSucursalMapper MAPPER = Mappers.getMapper(FranquiciaSucursalMapper.class);

    FranquiciaSucursal toDomain(FranquiciaSucursalData data);

    FranquiciaSucursalData toData(FranquiciaSucursal domain);
}
