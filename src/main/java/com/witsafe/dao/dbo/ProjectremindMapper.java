package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.Projectremind;
import com.witsafe.model.dbo.ProjectremindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectremindMapper {
    int countByExample(ProjectremindExample example);

    int deleteByExample(ProjectremindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Projectremind record);

    int insertSelective(Projectremind record);

    List<Projectremind> selectByExample(ProjectremindExample example);

    Projectremind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Projectremind record, @Param("example") ProjectremindExample example);

    int updateByExample(@Param("record") Projectremind record, @Param("example") ProjectremindExample example);

    int updateByPrimaryKeySelective(Projectremind record);

    int updateByPrimaryKey(Projectremind record);
}