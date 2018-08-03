package com.wanghao.auth.mapper.mysql;

import com.wanghao.auth.entity.UniCamelRoleAuth;
import com.wanghao.auth.entity.UniCamelRoleAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UniCamelRoleAuthMapper {
    int countByExample(UniCamelRoleAuthExample example);

    int deleteByExample(UniCamelRoleAuthExample example);

    List<UniCamelRoleAuth> selectByExample(UniCamelRoleAuthExample example);

    int updateByExampleSelective(@Param("record") UniCamelRoleAuth record, @Param("example") UniCamelRoleAuthExample example);

    int updateByExample(@Param("record") UniCamelRoleAuth record, @Param("example") UniCamelRoleAuthExample example);

    List<UniCamelRoleAuth> selectByExampleAndPage(UniCamelRoleAuthExample example, RowBounds rowBound);

    int insert(UniCamelRoleAuth record);

    int insertSelective(UniCamelRoleAuth record);
}