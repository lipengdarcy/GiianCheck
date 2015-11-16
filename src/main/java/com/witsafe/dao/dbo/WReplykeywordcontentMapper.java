package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WReplykeywordcontent;
import com.witsafe.model.dbo.WReplykeywordcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WReplykeywordcontentMapper {
    int countByExample(WReplykeywordcontentExample example);

    int deleteByExample(WReplykeywordcontentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WReplykeywordcontent record);

    int insertSelective(WReplykeywordcontent record);

    List<WReplykeywordcontent> selectByExample(WReplykeywordcontentExample example);

    WReplykeywordcontent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WReplykeywordcontent record, @Param("example") WReplykeywordcontentExample example);

    int updateByExample(@Param("record") WReplykeywordcontent record, @Param("example") WReplykeywordcontentExample example);

    int updateByPrimaryKeySelective(WReplykeywordcontent record);

    int updateByPrimaryKey(WReplykeywordcontent record);
}