package com.bawei.pojo;

public class News {
	private int id;
	private String name;
	private String url;
	private int score;
	private String created;
	@Override
	public String toString() {
		return "News [id=" + id + ", name=" + name + ", url=" + url
				+ ", score=" + score + ", created=" + created + "]";
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public News(int id, String name, String url, int score, String created) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.score = score;
		this.created = created;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
