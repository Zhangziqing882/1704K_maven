package com.bawei.pojo;

public class Zw {
	private int id;
	private String name;
	private String show;
	private String tname;
	private Integer tid;
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
	public String getShow() {
		return show;
	}
	public void setShow(String show) {
		this.show = show;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Zw(int id, String name, String show, String tname, Integer tid) {
		super();
		this.id = id;
		this.name = name;
		this.show = show;
		this.tname = tname;
		this.tid = tid;
	}
	public Zw() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Zw [id=" + id + ", name=" + name + ", show=" + show
				+ ", tname=" + tname + ", tid=" + tid + "]";
	}
	
}
