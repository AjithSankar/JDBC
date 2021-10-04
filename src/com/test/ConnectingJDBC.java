package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectingJDBC {

	public static void main(String[] args) throws Exception {

		// jdbc:postgresql://host:port/database
		String url = "jdbc:postgresql://localhost:5432/dvdrental";
		String user = "postgres";
		String password = "Aji@2867";

		String query = "select * from actor";

		Class.forName("org.postgresql.Driver");

		Connection con = DriverManager.getConnection(url, user, password);

		System.out.println("Connected successfully");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String name = rs.getString("first_name");
			System.out.println(name);
		}

	}

}
