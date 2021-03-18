package com.placement;

import org.hibernate.Session;

public class Database {

	public void insertUser(String name, int score, String grade, Session session) {
		// TODO Auto-generated method stub
		User user = new User(name, score, grade);
		
		session.save(user);
	}
}
