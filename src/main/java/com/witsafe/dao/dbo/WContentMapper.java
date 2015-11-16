package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WContent;
import com.witsafe.model.dbo.WContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WContentMapper {
    int countByExample(WContentExample example);

    int deleteByExample(WContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WContent record);

    int insertSelective(WContent record);

    List<WContent> selectByExample(WContentExample example);

    WContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WContent record, @Param("example") WContentExample example);

    int updateByExample(@Param("record") WContent record, @Param("example") WContentExample example);

    int updateByPrimaryKeySelective(WContent record);

    int updateByPrimaryKey(WContent record);
}