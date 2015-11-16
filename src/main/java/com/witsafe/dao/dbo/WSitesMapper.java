package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WSites;
import com.witsafe.model.dbo.WSitesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WSitesMapper {
    int countByExample(WSitesExample example);

    int deleteByExample(WSitesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WSites record);

    int insertSelective(WSites record);

    List<WSites> selectByExample(WSitesExample example);

    WSites selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WSites record, @Param("example") WSitesExample example);

    int updateByExample(@Param("record") WSites record, @Param("example") WSitesExample example);

    int updateByPrimaryKeySelective(WSites record);

    int updateByPrimaryKey(WSites record);
}