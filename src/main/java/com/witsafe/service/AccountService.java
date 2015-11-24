package com.witsafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witsafe.dao.dbo.MemberMapper;
import com.witsafe.dao.dbo.ProjectMapper;
import com.witsafe.dao.dbo.ProjectResultMapper;
import com.witsafe.dao.dbo.ProjectStepMapper;
import com.witsafe.model.dbo.Member;
import com.witsafe.model.dbo.MemberExample;
import com.witsafe.model.dbo.Project;
import com.witsafe.model.dbo.ProjectResult;
import com.witsafe.model.dbo.ProjectResultExample;
import com.witsafe.model.dbo.ProjectStep;
import com.witsafe.model.dbo.ProjectStepExample;
import com.witsafe.model.dbo.ext.ProjectResultExt;

@Service
public class AccountService {

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private ProjectMapper projectMapper;

	@Autowired
	private ProjectStepMapper projectStepMapper;

	@Autowired
	private ProjectResultMapper projectResultMapper;

	/**
	 * 查询用户
	 * 
	 * @param userId
	 *            用户id
	 * @return 用户详情
	 */
	public Member selectByPrimaryKey(String openid) {
		return memberMapper.selectByPrimaryKey(openid);
	}
	
	/**
	 * 修改用户信息（密码修改）
	 */
	public int updateUser(Member member) {
		return memberMapper.updateByPrimaryKeySelective(member);
	}

	/**
	 * 用户登录
	 * 
	 * @param user
	 *            用户手机号
	 * @param pass
	 *            用户密码
	 * @return 是否登录成功
	 */
	public Member isLoginSuccess(String user, String pass) {
		MemberExample e = new MemberExample();
		e.createCriteria().andTelephoneEqualTo(user).andPasswordEqualTo(pass);
		List<Member> list = memberMapper.selectByExample(e);
		if (list != null && list.size() == 1)
			return list.get(0);
		return null;
	}

	/**
	 * 根据用户查询项目
	 * 
	 * @param user
	 *            用户手机号
	 * @return 项目列表
	 */
	public List<Project> selectByUser(String user) {
		return projectMapper.selectByUser(user);
	}

	/**
	 * 根据项目id查询项目步骤
	 * 
	 * @param id
	 *            项目id
	 * @return 项目步骤列表
	 */
	public List<ProjectStep> selectProjectStep(Integer id) {
		ProjectStepExample e = new ProjectStepExample();
		e.or().andProjectidEqualTo(id);
		List<ProjectStep> list = projectStepMapper.selectByExample(e);
		return list;
	}

	/**
	 * 根据id查询项目结果
	 * 
	 * @param id
	 *            项目结果id
	 * @return 项目结果列表
	 */
	public ProjectResult selectProjectResultById(Integer id) {
		return projectResultMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据项目id查询项目结果
	 * 
	 * @param id
	 *            项目id
	 * @return 项目结果列表
	 */
	public List<ProjectResultExt> selectProjectResult(Integer id) {
		return selectProjectResult(id, 0);
	}

	/**
	 * 根据项目id, 步骤id查询项目结果
	 * 
	 * @param id
	 *            项目id
	 * @return 项目结果列表
	 */
	public List<ProjectResultExt> selectProjectResult(Integer id, Integer qid) {
		ProjectResultExample e = new ProjectResultExample();
		e.createCriteria().andProjectidEqualTo(id).andQuarteridEqualTo(qid);
		List<ProjectResultExt> list = projectResultMapper.selectByExample(e);
		return list;
	}

	/**
	 * 根据项目id, 步骤id更新项目步骤结果
	 * 
	 * @param id
	 *            项目id
	 * @return 记录成功数
	 */
	public int updateProjectResult(ProjectResult record) {
		if (record.getId() == null)
			return projectResultMapper.insertSelective(record);
		else
			return projectResultMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 删除项目结果
	 * 
	 * @param id
	 *            项目结果id
	 * @return 记录成功数
	 */
	public int deleteProjectResult(Integer id) {
		return projectResultMapper.deleteByPrimaryKey(id);
	}

}
