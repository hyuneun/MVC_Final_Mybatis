package net.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.mvc.model.UserDaoModel;
import net.mvc.model.UserManaget;

public class LoginAction implements Controller{//실제로 모델클래스와 통신
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		//모델 클래스를 처리
		UserManaget managet = UserManaget.instance();
		boolean b = managet.login(userid, password);
		
		ModelAndView modelAndView = new ModelAndView();
		if(b){
			HttpSession session = request.getSession(true);
			session.setAttribute("userid", userid);
			
			modelAndView.setPath("userlist.do");//로긴성공하면 리스트를보게끔 다시 컨트롤러로 돌아감
		}else{
			modelAndView.setPath("loginfail.html");
		}
		modelAndView.setRedirect(true);//클라이언트에서의 요청으로 web.xml을 만나야됨(컨트롤러로 가야되니까)(포워딩으로하면 못만남)
		return modelAndView;
	}
}
