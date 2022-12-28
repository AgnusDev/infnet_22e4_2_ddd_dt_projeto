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
				"jdbc:mysql://209.172.51.58:3306/agoraeuq_tktctrl?useTimezone=true&serverTimezone=UTC",
				"agoraeuq_cartp20", "null");
	}

	public void close() throws Exception {
		con.close();
	}

}
