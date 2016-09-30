package net.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mvc.model.UserDto;
import net.mvc.model.UserManaget;

public class InsertAction implements Controller{
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserDto formBean = new UserDto();//폼빈으로사용
		
		formBean.setUserid(request.getParameter("userid"));
		formBean.setPassword(request.getParameter("password"));
		formBean.setName(request.getParameter("name"));
		formBean.setEmail(request.getParameter("email"));
		
		int re = UserManaget.instance().insert(formBean);
		
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
