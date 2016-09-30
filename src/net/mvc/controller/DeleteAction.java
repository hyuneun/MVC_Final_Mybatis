package net.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mvc.model.UserManaget;

public class DeleteAction implements Controller{
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		String userid = request.getParameter("userid");
		
		int re = UserManaget.instance().delete(userid);
		
		ModelAndView modelAndView = new ModelAndView();
		if(re > 0){
			modelAndView.setPath("userlist.do");
		}else{
			modelAndView.setPath("fail.jsp");
		}
		modelAndView.setRedirect(true);
		return modelAndView;
	}
}
