package com.witsafe.controller;

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
import com.witsafe.model.dbo.Member;
import com.witsafe.model.dbo.ProjectResult;
import com.witsafe.service.AccountService;

/**
 * @Description 用户登录
 * @author lipeng
 */
@Controller
public class LoginController {
	private static Logger log = Logger.getLogger("InfoLogger");

	@Autowired
	private AccountService accountService;

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
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(ModelMap m, Member mb, HttpSession session) {
		Member user = accountService.isLoginSuccess(mb.getTelephone(),
				mb.getPassword());
		if (user != null) {
			log.info("登录成功页面：");
			m.put("user", mb.getTelephone());
			session.setAttribute("user", mb.getTelephone());
			session.setAttribute(Constant.ACCOUNT_SESSION_UID, user.getOpenid());
			return "redirect:/home/getProject";
		} else {
			log.info("用户名密码错误 ！");
			return "redirect:/login";
		}

	}

	/**
	 * 用户退出
	 */
	@RequestMapping(value = "/logout")
	public String logout(ModelMap m, HttpSession session) {
		session.removeAttribute("user");
		log.info("用户退出成功！");
		return "redirect:/login";

	}
	
	
	/**
	 * 修改密码页面
	 */
	@RequestMapping(value = "/changePasswordPage", method = RequestMethod.GET)
	public String changePasswordPage(ModelMap m) {
		return "changePassword";
	}
	
	/**
	 * 修改密码
	 */
	@ResponseBody
	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public ResponseData<Integer> changePassword(ModelMap m,
			Member record, String newPassword, HttpSession session) {
		ResponseData<Integer> data = new ResponseData<Integer>();
		
		String openid = (String) session.getAttribute(Constant.ACCOUNT_SESSION_UID);
		record.setOpenid(openid);
		
		Member member = accountService.isLoginSuccess(record.getTelephone(), record.getPassword());
		if(member==null){
			data.setCode(-1);
			data.setState("failed");
			data.setContent("原密码输入错误！");
			return data;
		}
		record.setPassword(newPassword);
		
		try {
			int count = accountService.updateUser(record);
			data.setState("success");
			data.setContent("密码修改成功！");
			data.setResult(count);
			return data;
		} catch (Exception e) {
			data.setCode(-1);
			data.setState("failed");
			data.setContent("密码修改失败！");
			return data;
		}

	}

}
