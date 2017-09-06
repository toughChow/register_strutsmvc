package com.qingshixun.register.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String user = "root";
		String password = "Betough3";
		String jdbcUrl = "jdbc:mysql:///qingshixun";
		String driverClass = "com.mysql.jdbc.Driver";
		// 加载驱动
		Class.forName(driverClass);

		// 获取数据库连接
		Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
		return connection;
	}

	public static void ReleaseConnection(Connection connection, PreparedStatement preparedStatement,
			ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
			}
		}
		if (preparedStatement != null) {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
	}
}
