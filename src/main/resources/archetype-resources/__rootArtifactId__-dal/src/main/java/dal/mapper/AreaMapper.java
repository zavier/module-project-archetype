#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal.mapper;

import ${package}.dal.entity.Area;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 地区表 Mapper 接口
 * </p>
 *
 * @author zhengwei
 * @since 2019-11-03
 */
@Repository
public interface AreaMapper extends BaseMapper<Area> {

}
