package net.mvc.model;

import java.util.ArrayList;

public class UserManaget {//여러개의 dao를 관리
	public static UserManaget manager = new UserManaget();
	
	public static UserManaget instance(){
		return manager;
	}
	
	public UserDaoModel getUserDaoModel(){
		return new UserDaoModel();
	}
	
	public boolean login(String userid,String user_password){
		UserDto dto = getUserDaoModel().findUser(userid);
		if(dto == null) return false;//아디없음
		if(dto.getPassword().equals(user_password)){
			return true;
		}else{//비번틀림
			return false;
		}
	}
	
	public ArrayList<UserDto> getUserList(){
		return getUserDaoModel().getUserList();
	}
	
	public UserDto findUser(String userid){
		return getUserDaoModel().findUser(userid);
	}
	
	public int update(UserDto formBean){
		return getUserDaoModel().update(formBean);
	}
	
	public int insert(UserDto formBean){
		return getUserDaoModel().insert(formBean);
	}
	
	public int delete(String userid){
		return getUserDaoModel().delete(userid);
	}
	
	
}
