package com.witsafe.dao.dbo;

import com.witsafe.model.dbo.ProjectResult;
import com.witsafe.model.dbo.ProjectResultExample;
import com.witsafe.model.dbo.ext.ProjectResultExt;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ProjectResultMapper {
	
	
	@Select("select * from dbo.Project_Result where ID=#{id}") 
	public ProjectResult selectTest(Integer id);
	
    int countByExample(ProjectResultExample example);

    int deleteByExample(ProjectResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectResult record);

    int insertSelective(ProjectResult record);

    List<ProjectResultExt> selectByExample(ProjectResultExample example);

    ProjectResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectResult record, @Param("example") ProjectResultExample example);

    int updateByExample(@Param("record") ProjectResult record, @Param("example") ProjectResultExample example);

    int updateByPrimaryKeySelective(ProjectResult record);

    int updateByPrimaryKey(ProjectResult record);
}