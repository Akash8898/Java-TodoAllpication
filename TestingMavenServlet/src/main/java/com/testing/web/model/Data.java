package com.testing.web.model;

public class Data {

	private int id;
	private String name;
	private String tech;
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
}
