package com.wanghao.auth.mapper.mysql;

import com.wanghao.auth.entity.UniCamelUserRole;
import com.wanghao.auth.entity.UniCamelUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UniCamelUserRoleMapper {
    int countByExample(UniCamelUserRoleExample example);

    int deleteByExample(UniCamelUserRoleExample example);

    List<UniCamelUserRole> selectByExample(UniCamelUserRoleExample example);

    int updateByExampleSelective(@Param("record") UniCamelUserRole record, @Param("example") UniCamelUserRoleExample example);

    int updateByExample(@Param("record") UniCamelUserRole record, @Param("example") UniCamelUserRoleExample example);

    List<UniCamelUserRole> selectByExampleAndPage(UniCamelUserRoleExample example, RowBounds rowBound);

    int insert(UniCamelUserRole record);

    int insertSelective(UniCamelUserRole record);
}