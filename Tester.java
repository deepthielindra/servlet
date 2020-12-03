package com.demo;

import java.sql.Connection;

public class Tester {
	
	public static void main(String[] args) {
		Connection conn = ConnectionFactory.getConnection();
		if(conn!=null) {
    
      System.out.println("--------------------------"); 
			System.out.println("connected successfully");
			System.out.println(conn.getClass());
		}
	}

}
