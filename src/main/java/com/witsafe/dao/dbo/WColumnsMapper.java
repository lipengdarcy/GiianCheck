package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WColumns;
import com.witsafe.model.dbo.WColumnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WColumnsMapper {
    int countByExample(WColumnsExample example);

    int deleteByExample(WColumnsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WColumns record);

    int insertSelective(WColumns record);

    List<WColumns> selectByExample(WColumnsExample example);

    WColumns selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WColumns record, @Param("example") WColumnsExample example);

    int updateByExample(@Param("record") WColumns record, @Param("example") WColumnsExample example);

    int updateByPrimaryKeySelective(WColumns record);

    int updateByPrimaryKey(WColumns record);
}