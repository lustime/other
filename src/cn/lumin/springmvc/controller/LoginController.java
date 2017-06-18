package cn.lumin.springmvc.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lumin.springmvc.entity.User;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String login() {
		return "session/login";
	}

	@RequestMapping("judge")
	public String judge(HttpServletRequest request, User user) {
		request.getSession().setAttribute("user", user);
		Integer count = (Integer) request.getSession().getServletContext()
				.getAttribute("count");
		if (count == null)
			count = 0;
		request.getSession().getServletContext().setAttribute("count", ++count);
		return "redirect:/user.jsp";
	}

	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		Integer count = (Integer) request.getSession().getServletContext()
				.getAttribute("count");
		request.getSession().getServletContext().setAttribute("count", --count);
		return "session/login";
	}
}
