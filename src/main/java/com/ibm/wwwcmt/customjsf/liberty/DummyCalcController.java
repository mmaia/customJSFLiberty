package com.ibm.wwwcmt.customjsf.liberty;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DummyCalcController {
	
	Logger logger = Logger.getLogger(DummyCalcController.class.getName());
	
	private int x;
	private int y;
	private String result;
	
	public String add(){
		logger.info("Executing add");
		int result = x + y;
		this.result = "Result of sum of " + x + " + " + y + " = " + result;
		return "success";
	}
	
	public String subtract(){
		logger.info("Executing subtract");
		int result = x - y;
		this.result = "Result of subtract of " + x + " - " + y + " = " + result;
		return "success";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
