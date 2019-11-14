#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.mapper;

import ${package}.dal.entity.Area;
import ${package}.service.dto.AreaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AreaDTOMapper {
    AreaDTOMapper INSTANCE = Mappers.getMapper(AreaDTOMapper.class);

    AreaDTO areaToAreaDto(Area area);
}
