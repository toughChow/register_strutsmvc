package com.qingshixun.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.qingshixun.register.utils.ConnectionUtil;

public class BaseDao {

	protected Connection connection = null;
	protected PreparedStatement preparedStatement = null;
	protected ResultSet resultSet = null;

	public void insertUser(String sql, Object... args) {
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			// 获取参数
			for (int i = 0; i < args.length; i++) {
				preparedStatement.setObject(i + 1, args[i]);
			}
			// 执行
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.ReleaseConnection(connection, preparedStatement, resultSet);
		}
	}
}
