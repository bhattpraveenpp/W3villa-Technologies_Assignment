package com.placement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String username;
	
	private int score;
	private String grade;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, int score, String grade) {
		super();
		this.username = username;
		this.score = score;
		this.grade = grade;
	}

	public String getUsername() {
		return username;
	}

	public int getScore() {
		return score;
	}

	public String getGrade() {
		return grade;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
