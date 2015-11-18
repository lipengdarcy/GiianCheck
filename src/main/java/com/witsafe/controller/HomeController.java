package com.witsafe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.witsafe.framework.common.Constant;
import com.witsafe.model.common.ResponseData;
import com.witsafe.model.dbo.Project;
import com.witsafe.model.dbo.ProjectResult;
import com.witsafe.model.dbo.ProjectStep;
import com.witsafe.model.dbo.ext.ProjectResultExt;
import com.witsafe.service.AccountService;
import com.witsafe.service.NationstandardService;
import com.witsafe.service.OrganizationService;

/**
 * @Description 查询自己的项目
 * @author lipeng
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	private static Logger log = Logger.getLogger("InfoLogger");

	@Autowired
	private AccountService accountService;


	/**
	 * 主页面
	 */
	@RequestMapping()
	public String load(ModelMap m) {
		log.info("管理主页面：");
		return "redirect:/home/getProject";
	}

	/**
	 * 项目展示
	 */
	@RequestMapping(value = "/getProject", method = RequestMethod.GET)
	public String getProject(ModelMap m, String user, HttpSession session) {
		String u = user;
		if (u == null)
			u = (String) session.getAttribute("user");
		List<Project> list = accountService.selectByUser(u);
		m.put("projectList", list);
		return "home/index";
	}

	/**
	 * 项目步骤展示
	 */
	@RequestMapping(value = "/getProjectStep", method = RequestMethod.GET)
	public String getProjectStep(ModelMap m, Integer projectid) {
		List<ProjectStep> list = null;
		if (projectid != null)
			list = accountService.selectProjectStep(projectid);
		m.put("projectStepList", list);
		return "home/projectstep";
	}

	/**
	 * 项目结果展示
	 */
	@RequestMapping(value = "/getProjectResult", method = RequestMethod.GET)
	public String getProjectResult(ModelMap m, Integer projectid,
			Integer quarterid) {
		List<ProjectResultExt> list = null;
		if (projectid != null) {
			if (quarterid != null)
				list = accountService.selectProjectResult(projectid, quarterid);
			else
				list = accountService.selectProjectResult(projectid);
		}
		m.put("projectResultList", list);
		m.put("projectid", projectid);
		m.put("quarterid", quarterid);
		return "home/projectresult";
	}

	/**
	 * 项目结果更新
	 */
	@ResponseBody
	@RequestMapping(value = "/updateProjectResult")
	public ResponseData<Integer> updateProjectResult(ModelMap m,
			ProjectResult record, HttpSession session) {
		String createuserid = (String) session.getAttribute(Constant.ACCOUNT_SESSION_UID);
		record.setCreateuserid(createuserid);

		ResponseData<Integer> data = new ResponseData<Integer>();
		try {
			int count = accountService.updateProjectResult(record);
			data.setState("success");
			data.setContent("更新成功！");
			data.setResult(count);
			return data;
		} catch (Exception e) {
			data.setCode(-1);
			data.setState("failed");
			data.setContent("更新失败！");
			return data;
		}

	}

	/**
	 * 项目结果删除
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteProjectResult")
	public ResponseData<Integer> deleteProjectResult(ModelMap m, Integer id) {

		ResponseData<Integer> data = new ResponseData<Integer>();
		try {
			int count = accountService.deleteProjectResult(id);
			data.setState("success");
			data.setContent("删除成功！");
			data.setResult(count);
			return data;
		} catch (Exception e) {
			data.setCode(-1);
			data.setState("failed");
			data.setContent("删除失败！");
			return data;
		}

	}

}
