package com.wanghao.auth.mapper.mysql;

import com.wanghao.auth.entity.UniCamelRole;
import com.wanghao.auth.entity.UniCamelRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UniCamelRoleMapper {
    int countByExample(UniCamelRoleExample example);

    int deleteByExample(UniCamelRoleExample example);

    List<UniCamelRole> selectByExample(UniCamelRoleExample example);

    int updateByExampleSelective(@Param("record") UniCamelRole record, @Param("example") UniCamelRoleExample example);

    int updateByExample(@Param("record") UniCamelRole record, @Param("example") UniCamelRoleExample example);

    List<UniCamelRole> selectByExampleAndPage(UniCamelRoleExample example, RowBounds rowBound);

    int deleteByPrimaryKey(String roleId);

    int insert(UniCamelRole record);

    int insertSelective(UniCamelRole record);

    UniCamelRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(UniCamelRole record);

    int updateByPrimaryKey(UniCamelRole record);
}