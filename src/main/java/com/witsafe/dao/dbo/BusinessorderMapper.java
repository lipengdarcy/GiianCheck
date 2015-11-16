package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.Businessorder;
import com.witsafe.model.dbo.BusinessorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessorderMapper {
    int countByExample(BusinessorderExample example);

    int deleteByExample(BusinessorderExample example);

    int deleteByPrimaryKey(Integer borderid);

    int insert(Businessorder record);

    int insertSelective(Businessorder record);

    List<Businessorder> selectByExample(BusinessorderExample example);

    Businessorder selectByPrimaryKey(Integer borderid);

    int updateByExampleSelective(@Param("record") Businessorder record, @Param("example") BusinessorderExample example);

    int updateByExample(@Param("record") Businessorder record, @Param("example") BusinessorderExample example);

    int updateByPrimaryKeySelective(Businessorder record);

    int updateByPrimaryKey(Businessorder record);
}