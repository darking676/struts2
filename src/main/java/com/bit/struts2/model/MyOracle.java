package com.bit.struts2.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyOracle {

	private static Connection conn;
	
	private MyOracle() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() {
		
		try {
			if(conn==null||conn.isClosed()){
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;

	}
}
