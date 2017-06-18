package cn.lumin.springmvc.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.net.httpserver.HttpContext;

import cn.lumin.springmvc.bo.Student;
import cn.lumin.springmvc.vo.Condition;

@Controller
@RequestMapping("/HelloController")
public class HelloController {
	//url映射
	@RequestMapping("/hello")
	public String hello()
	{
		return "/index.jsp";
	}
	//接收请求参数
	@RequestMapping("/parameter")
	public String parameter(Condition condition)
	{
		System.out.println(condition.getName());
		System.out.println(condition.getAge());
		System.out.println(condition);
		return "/index.jsp";
		
	}
	
	//把数据放入作用域
	@RequestMapping("scope")
	public ModelAndView scop()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "张三");
		modelAndView.addObject("age", "20");
		modelAndView.setViewName("/index.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("scope2")
	public String scope2(Map<String, Object> model)
	{
		model.put("name", "lisi");
		return "/index.jsp";
	}
	
	@RequestMapping("scope3")
	public String scope3(Map<String, Object> model)
	{
		model.put("name", "lisi");
		return "/index.jsp";
	}
	
	@RequestMapping("gogogo")
	public String gogogo(Map<String, Object> model)
	{
		model.put("name", "lisi");
	//	return "redirect:/index.jsp";
		return "redirect:http://www.baidu.com";
	}
	
	@RequestMapping("resourceView")
	public String resourceView(Map<String, Object> model)
	{
		model.put("name", "lisi");
		return "product/p";
	}
	
	@RequestMapping("json")
	@ResponseBody
	public Student json()
	{
		Student student=new Student("001","zs",12);
		
		return student;
	}
	
	@RequestMapping("native")
	public String nativeTest(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println(request);
		
		System.out.println(request.getSession().getServletContext());
		return "redirect:/index.jsp";
	}
}
