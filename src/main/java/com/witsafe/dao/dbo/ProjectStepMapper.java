package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.ProjectStep;
import com.witsafe.model.dbo.ProjectStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectStepMapper {
    int countByExample(ProjectStepExample example);

    int deleteByExample(ProjectStepExample example);

    int insert(ProjectStep record);

    int insertSelective(ProjectStep record);

    List<ProjectStep> selectByExample(ProjectStepExample example);

    int updateByExampleSelective(@Param("record") ProjectStep record, @Param("example") ProjectStepExample example);

    int updateByExample(@Param("record") ProjectStep record, @Param("example") ProjectStepExample example);
}