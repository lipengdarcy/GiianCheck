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
import com.witsafe.service.AccountService;

/**
 * @Description 主页操作，包括查看，编辑，删除通讯录，维护组织机构等
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
		log.info("组织机构页面：");
		return "home/index";
	}
	
	/**
	 * 登录成功后系统首页（一般存在top、left、right三大区域通过frameset包含）
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index" ,method=RequestMethod.GET)
	public String main(Model model) {
		return "system/index";
	}
	
	/**
	 * 如果首页为frameset布局，则存在top
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/top" ,method=RequestMethod.GET)
	public String top(Model model) {
		return "system/top";
	}
	
	/**
	 * 如果首页为frameset布局，则存在left
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/left" ,method=RequestMethod.GET)
	public String left(Model model) {
		return "system/left";
	}
	
	/**
	 * 如果首页为frameset布局，则存在middle时
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/middle" ,method=RequestMethod.GET)
	public String middle(Model model) {
		return "system/middle";
	}
	
	/**
	 * 如果首页为frameset布局，则存在right
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/right" ,method=RequestMethod.GET)
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

	
}
