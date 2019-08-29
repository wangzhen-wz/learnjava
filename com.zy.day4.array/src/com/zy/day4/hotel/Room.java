package com.zy.day4.hotel;

public class Room {
	

	//房间编号
	private String id;
	
	//房间类型
	private String type;
	
	//是否空房
	private boolean isUse;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUse() {
		return isUse;
	}

	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	
	public Room(String id, String type, boolean isUse) {
		super();
		this.id = id;
		this.type = type;
		this.isUse = isUse;
	}
	
	public  Room() {
		
	}

	@Override
	public String toString() {
		return  "[" + id +"," + type + "," + (isUse?"占用 ": "空闲")+"]";
	}
	
}
