package main.java.br.agoraeuquero.ticketcontroller.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	Connection con;
	PreparedStatement stmt;
	ResultSet rs;

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://111.111.11.11:1111/null?useTimezone=true&serverTimezone=UTC",
				"null", "null");
	}

	public void close() throws Exception {
		con.close();
	}

}
