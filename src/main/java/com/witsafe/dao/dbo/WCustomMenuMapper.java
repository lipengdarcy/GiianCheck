package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WCustomMenu;
import com.witsafe.model.dbo.WCustomMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WCustomMenuMapper {
    int countByExample(WCustomMenuExample example);

    int deleteByExample(WCustomMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WCustomMenu record);

    int insertSelective(WCustomMenu record);

    List<WCustomMenu> selectByExample(WCustomMenuExample example);

    WCustomMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WCustomMenu record, @Param("example") WCustomMenuExample example);

    int updateByExample(@Param("record") WCustomMenu record, @Param("example") WCustomMenuExample example);

    int updateByPrimaryKeySelective(WCustomMenu record);

    int updateByPrimaryKey(WCustomMenu record);
}