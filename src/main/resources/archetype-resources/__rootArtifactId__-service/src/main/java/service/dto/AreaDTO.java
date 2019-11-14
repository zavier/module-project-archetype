#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.dto;

import lombok.Data;

@Data
public class AreaDTO {
    private String id;
    private String name;
}
