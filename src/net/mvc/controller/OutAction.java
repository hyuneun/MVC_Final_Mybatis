package net.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;


public class OutAction implements Controller{
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession(true);
		session.removeAttribute("userid");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setPath("login.jsp");
		modelAndView.setRedirect(false);
		return modelAndView;
	}
}
