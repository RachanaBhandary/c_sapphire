package com.slk.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.stereotype.Repository;

@Repository
public class c_SDBUtil {
	private static Connection connection = null;

	public static Connection getConnection() throws IOException {

		if (connection != null)
			return connection;
		else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/c_sapphirebank?useSSL=false";
				String user = "root";
				String password = "1234";
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return connection;
		}

	}

}
