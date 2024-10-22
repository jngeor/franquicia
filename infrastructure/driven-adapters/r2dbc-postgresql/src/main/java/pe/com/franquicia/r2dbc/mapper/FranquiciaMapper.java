package pe.com.franquicia.r2dbc.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pe.com.franquicia.model.franquicia.Franquicia;
import pe.com.franquicia.r2dbc.entity.FranquiciaData;

@Mapper
public interface FranquiciaMapper {
    FranquiciaMapper MAPPER = Mappers.getMapper(FranquiciaMapper.class);

    Franquicia dataToDomain(FranquiciaData data);

    FranquiciaData domainToData(Franquicia domain);

}
