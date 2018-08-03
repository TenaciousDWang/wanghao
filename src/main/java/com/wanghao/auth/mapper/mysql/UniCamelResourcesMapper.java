package com.wanghao.auth.mapper.mysql;

import com.wanghao.auth.entity.UniCamelResources;
import com.wanghao.auth.entity.UniCamelResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UniCamelResourcesMapper {
    int countByExample(UniCamelResourcesExample example);

    int deleteByExample(UniCamelResourcesExample example);

    List<UniCamelResources> selectByExample(UniCamelResourcesExample example);

    int updateByExampleSelective(@Param("record") UniCamelResources record, @Param("example") UniCamelResourcesExample example);

    int updateByExample(@Param("record") UniCamelResources record, @Param("example") UniCamelResourcesExample example);

    List<UniCamelResources> selectByExampleAndPage(UniCamelResourcesExample example, RowBounds rowBound);

    int deleteByPrimaryKey(String resourcesId);

    int insert(UniCamelResources record);

    int insertSelective(UniCamelResources record);

    UniCamelResources selectByPrimaryKey(String resourcesId);

    int updateByPrimaryKeySelective(UniCamelResources record);

    int updateByPrimaryKey(UniCamelResources record);
}