package com.qingshixun.register.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtils {

	private static DataSource dataSource = null;
	// 初始化数据库连接池
	static{
		dataSource = new ComboPooledDataSource("c3p0");
	}
	
	// 获取连接
	public static Connection getConnection() throws SQLException{
		return dataSource.getConnection();
	}
	
	// 开启事务
	public static void beginTX(Connection connection){
		if(connection != null){
			try {
				connection.setAutoCommit(false);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 回滚事务
	public static void rollbackTX(Connection connection){
		if(connection != null){
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 提交事务
	public static void commitTX(Connection connection){
		if(connection != null){
			try {
				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 释放连接
	public static void releaseDB(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet){
		if(resultSet != null){
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(preparedStatement != null){
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(connection != null){
			try {
				// 将数据库归还到连接池
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
