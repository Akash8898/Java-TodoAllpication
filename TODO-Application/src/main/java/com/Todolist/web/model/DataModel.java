package com.Todolist.web.model;

public class DataModel {
	
	@Override
	public String toString() {																				
		return "DataModel [id=" + id + ", todo=" + todo + ", status=" + status + "]";
	}
	int id;
	String todo;
	boolean status = true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
