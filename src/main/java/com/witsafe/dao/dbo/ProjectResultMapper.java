package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.ProjectResult;
import com.witsafe.model.dbo.ProjectResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectResultMapper {
    int countByExample(ProjectResultExample example);

    int deleteByExample(ProjectResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectResult record);

    int insertSelective(ProjectResult record);

    List<ProjectResult> selectByExample(ProjectResultExample example);

    ProjectResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectResult record, @Param("example") ProjectResultExample example);

    int updateByExample(@Param("record") ProjectResult record, @Param("example") ProjectResultExample example);

    int updateByPrimaryKeySelective(ProjectResult record);

    int updateByPrimaryKey(ProjectResult record);
}