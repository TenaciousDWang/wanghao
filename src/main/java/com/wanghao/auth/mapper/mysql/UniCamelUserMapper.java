package com.wanghao.auth.mapper.mysql;

import com.wanghao.auth.entity.UniCamelUser;
import com.wanghao.auth.entity.UniCamelUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UniCamelUserMapper {
    int countByExample(UniCamelUserExample example);

    int deleteByExample(UniCamelUserExample example);

    List<UniCamelUser> selectByExample(UniCamelUserExample example);

    int updateByExampleSelective(@Param("record") UniCamelUser record, @Param("example") UniCamelUserExample example);

    int updateByExample(@Param("record") UniCamelUser record, @Param("example") UniCamelUserExample example);

    List<UniCamelUser> selectByExampleAndPage(UniCamelUserExample example, RowBounds rowBound);

    int deleteByPrimaryKey(String userId);

    int insert(UniCamelUser record);

    int insertSelective(UniCamelUser record);

    UniCamelUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UniCamelUser record);

    int updateByPrimaryKey(UniCamelUser record);
}