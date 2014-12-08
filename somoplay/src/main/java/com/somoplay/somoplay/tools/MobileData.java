package com.somoplay.somoplay.tools;

import java.util.HashMap;


public class MobileData {

	private String status;
	private String type;
	private int number_of_array;
	private String service_name;
	private HashMap<String, String> data;
	
	public MobileData(){
	}
	
	public MobileData(String status, String type, int number_of_array, String service_name, String heading, String content ){
		this.status = status;
		this.type = type;
		this.number_of_array = number_of_array;
		this.service_name = service_name;
		data.put("heading", heading);
		data.put("content", content);
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumber_of_array() {
		return number_of_array;
	}
	public void setNumber_of_array(int number_of_array) {
		this.number_of_array = number_of_array;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public HashMap<String, String> getData() {
		return data;
	}
	public void setData(HashMap<String, String> data) {
		this.data = data;
	}
	
}
