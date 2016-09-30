package net.mvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.mvc.model.UserDto;
import net.mvc.model.UserManaget;

public class ListAction implements Controller{
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//UserManaget managet = UserManaget.instance();
		//ArrayList<UserDto> list = managet.getUserList();
		ArrayList<UserDto> list = UserManaget.instance().getUserList();//포함관계
		request.setAttribute("list", list);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setRedirect(false);//jsp로 가야되기떄문에 포워드로간당
		modelAndView.setPath("userlist.jsp");
		
		return modelAndView;
	}
}
