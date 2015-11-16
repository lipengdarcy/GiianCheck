package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.WReplykeyword;
import com.witsafe.model.dbo.WReplykeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WReplykeywordMapper {
    int countByExample(WReplykeywordExample example);

    int deleteByExample(WReplykeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WReplykeyword record);

    int insertSelective(WReplykeyword record);

    List<WReplykeyword> selectByExample(WReplykeywordExample example);

    WReplykeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WReplykeyword record, @Param("example") WReplykeywordExample example);

    int updateByExample(@Param("record") WReplykeyword record, @Param("example") WReplykeywordExample example);

    int updateByPrimaryKeySelective(WReplykeyword record);

    int updateByPrimaryKey(WReplykeyword record);
}