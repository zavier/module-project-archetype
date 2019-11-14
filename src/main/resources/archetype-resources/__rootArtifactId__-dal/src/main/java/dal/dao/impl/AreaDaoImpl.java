#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dal.dao.impl;

import ${package}.dal.entity.Area;
import ${package}.dal.mapper.AreaMapper;
import ${package}.dal.dao.AreaDao;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地区表 服务实现类
 * </p>
 *
 * @author zhengwei
 * @since 2019-11-03
 */
@Service
public class AreaDaoImpl extends ServiceImpl<AreaMapper, Area> implements AreaDao {

}
