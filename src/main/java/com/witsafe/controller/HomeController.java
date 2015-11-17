package com.witsafe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.witsafe.model.Account;
import com.witsafe.model.NationstandardWithBLOBs;
import com.witsafe.model.Organization;
import com.witsafe.model.common.JqGridData;
import com.witsafe.model.common.ResponseData;
import com.witsafe.model.dbo.Member;
import com.witsafe.model.dbo.Project;
import com.witsafe.model.dbo.ProjectResult;
import com.witsafe.model.dbo.ProjectStep;
import com.witsafe.model.dbo.ext.ProjectResultExt;
import com.witsafe.service.AccountService;
import com.witsafe.service.NationstandardService;
import com.witsafe.service.OrganizationService;

/**
 * @Description 用户登录、查询自己的项目
 * @author lipeng
 */
@Controller
@RequestMapping("/home")
public class HomeController {
	private static Logger log = Logger.getLogger("InfoLogger");

	@Autowired
	private AccountService accountService;

	@Autowired
	private OrganizationService organizationService;

	@Autowired
	private NationstandardService nationstandardService;

	/**
	 * 主页面
	 */
	@RequestMapping()
	public String load(ModelMap m) {
		log.info("组织机构页面：");
		return "home/index";
	}

	/**
	 * 登录成功后系统首页（一般存在top、left、right三大区域通过frameset包含）
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String main(Model model) {
		return "system/index";
	}

	/**
	 * 如果首页为frameset布局，则存在top
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public String top(Model model) {
		return "system/top";
	}

	/**
	 * 如果首页为frameset布局，则存在left
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/left", method = RequestMethod.GET)
	public String left(Model model) {
		return "system/left";
	}

	/**
	 * 如果首页为frameset布局，则存在middle时
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/middle", method = RequestMethod.GET)
	public String middle(Model model) {
		return "system/middle";
	}

	/**
	 * 如果首页为frameset布局，则存在right
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/right", method = RequestMethod.GET)
	public String right(Model model) {
		return "system/right";
	}

	/**
	 * 组织机构页面
	 */
	@RequestMapping(value = "/organizationPage")
	public String organizationPage(ModelMap m) {
		return "home/organization";
	}

	/**
	 * 新增机构
	 */
	@ResponseBody
	@RequestMapping(value = "/addOrg", method = RequestMethod.POST)
	public ResponseData<Integer> addOrg(HttpSession session, Organization org,
			ModelMap m) {
		ResponseData<Integer> data = new ResponseData<Integer>();
		try {
			organizationService.insert(org);
			data.setState("success");
			data.setContent("新增成功！");
			return data;
		} catch (Exception e) {
			data.setState("failed");
			data.setCode(-1);
			data.setContent("新增失败！");
			return data;
		}

	}

	/**
	 * 删除机构
	 */
	@ResponseBody
	@RequestMapping(value = "/delOrg", method = RequestMethod.POST)
	public ResponseData delOrg(HttpSession session, int orgid, ModelMap m) {
		ResponseData data = new ResponseData();
		try {
			organizationService.delete(orgid);
			data.setState("success");
			data.setContent("删除成功！");
			return data;
		} catch (Exception e) {
			data.setState("failed");
			data.setCode(-1);
			data.setContent("删除失败！");
			return data;
		}

	}

	/**
	 * 编辑机构
	 */
	@ResponseBody
	@RequestMapping(value = "/editOrg", method = RequestMethod.POST)
	public ResponseData editOrg(HttpSession session, Organization org,
			ModelMap m) {
		ResponseData data = new ResponseData();
		try {
			organizationService.update(org);
			data.setState("success");
			data.setContent("编辑成功！");
			return data;
		} catch (Exception e) {
			data.setCode(-1);
			data.setState("failed");
			data.setContent("编辑失败！");
			return data;
		}

	}

	/**
	 * 查询所有机构
	 */
	@ResponseBody
	@RequestMapping(value = "/queryOrg", method = RequestMethod.POST)
	public ResponseData<List<Organization>> queryOrg(ModelMap m) {
		ResponseData<List<Organization>> data = new ResponseData<List<Organization>>();
		try {
			log.info("查询所有机构");
			List<Organization> list = organizationService.selectAll();
			data.setContent("查询成功！");
			data.setResult(list);
			return data;
		} catch (Exception e) {
			data.setCode(-1);
			data.setState("failed");
			data.setContent("查询失败！");
			return data;
		}

	}

	/**
	 * 国家标准页面
	 */
	@RequestMapping(value = "/standardPage")
	public String standardPage(ModelMap m) {
		return "home/standard";
	}

	/**
	 * 登录页面
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(ModelMap m) {
		return "login";
	}

	/**
	 * 登录验证
	 */
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap m, Member mb, HttpSession session) {
		Member user = accountService.isLoginSuccess(mb.getTelephone(),
				mb.getPassword());
		if (user!=null) {
			log.info("登录成功页面：");
			m.put("user", mb.getTelephone());
			session.setAttribute("user", mb.getTelephone());
			session.setAttribute("useropenid", user.getOpenid());
			return "redirect:/home/getProject";
		} else {
			log.info("用户名密码错误 ！");
			return "redirect:/home/loginPage";
		}

	}

	/**
	 * 登录验证
	 */
	@RequestMapping(value = "/logout")
	public String logout(ModelMap m, HttpSession session) {
		session.removeAttribute("user");
		log.info("用户退出成功！");
		return "redirect:/home/login";

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
	public String getProjectResult(ModelMap m, Integer projectid, Integer quarterid) {
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
	public ResponseData<Integer> updateProjectResult(ModelMap m, ProjectResult record,
			HttpSession session) {
		String createuserid =  (String) session.getAttribute("useropenid");
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
	  项目结果删除
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteProjectResult")
	public ResponseData<Integer> deleteProjectResult(ModelMap m, Integer id,
			HttpSession session) {
		
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
