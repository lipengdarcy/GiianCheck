package com.witsafe.framework.common.interprecetor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.witsafe.framework.common.Constant;
import com.witsafe.model.common.StatusHtml;

@Component
public class ControllerInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//拦截除了登录的其他请求
		if (!request.getServletPath().equals("/login")) {
		// 如果session中没有user对象
		if (null == request.getSession().getAttribute(
				Constant.ACCOUNT_SESSION_UID)) {
			String requestedWith = request.getHeader("x-requested-with");
			// ajax请求
			if (requestedWith != null && "XMLHttpRequest".equals(requestedWith)) {
				StatusHtml statusHtml = new StatusHtml();
				statusHtml.setStatusCode("301");
				statusHtml.setMessage("登录超时！");
				statusHtml.setCallbackType("closeCurrent");
				response.setHeader("session-status", "timeout");
				response.getWriter().print(JSON.toJSONString(statusHtml));
			} else {
				// 普通页面请求
				response.sendRedirect(request.getContextPath() + "/login");
			}
			return false;
		}
		}

		return true;

	}

	// 在业务处理器处理请求执行完成后,生成视图之前执行的动作
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// loggerinfo.info("==========[ControllerInterceptor] 2:postHandle...");
	}

	/**
	 * 在DispatcherServlet完全处理完请求后被调用
	 * 
	 * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion()
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// loggerinfo.info("==========[ControllerInterceptor] 3:afterCompletion...");
	}
}
