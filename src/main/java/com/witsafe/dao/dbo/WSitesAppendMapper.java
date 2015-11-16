package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WSitesAppend;
import com.witsafe.model.dbo.WSitesAppendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WSitesAppendMapper {
    int countByExample(WSitesAppendExample example);

    int deleteByExample(WSitesAppendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WSitesAppend record);

    int insertSelective(WSitesAppend record);

    List<WSitesAppend> selectByExample(WSitesAppendExample example);

    WSitesAppend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WSitesAppend record, @Param("example") WSitesAppendExample example);

    int updateByExample(@Param("record") WSitesAppend record, @Param("example") WSitesAppendExample example);

    int updateByPrimaryKeySelective(WSitesAppend record);

    int updateByPrimaryKey(WSitesAppend record);
}