package net.mvc.controller;

public class ModelAndView { //view 파일 호출방식과 파일명기억
	private boolean isRedirect = false;
	private String path = "";
	
	public boolean isRedirect(){
		return isRedirect;
	}
	
	public void setRedirect(boolean isRedirect){
		this.isRedirect = isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
