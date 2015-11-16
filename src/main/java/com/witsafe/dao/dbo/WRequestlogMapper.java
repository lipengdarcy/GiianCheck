package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WRequestlog;
import com.witsafe.model.dbo.WRequestlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WRequestlogMapper {
    int countByExample(WRequestlogExample example);

    int deleteByExample(WRequestlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WRequestlog record);

    int insertSelective(WRequestlog record);

    List<WRequestlog> selectByExample(WRequestlogExample example);

    WRequestlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WRequestlog record, @Param("example") WRequestlogExample example);

    int updateByExample(@Param("record") WRequestlog record, @Param("example") WRequestlogExample example);

    int updateByPrimaryKeySelective(WRequestlog record);

    int updateByPrimaryKey(WRequestlog record);
}