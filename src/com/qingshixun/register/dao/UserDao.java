package com.qingshixun.register.dao;

import java.sql.SQLException;

import com.qingshixun.register.utils.JDBCUtils;

public class UserDao extends BaseDao {

	/**
	 * 使用c3p0连接池
	 */
	@Override
	public void insertUser(String sql, Object... args) {
		try {
			connection = JDBCUtils.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				preparedStatement.setObject(i + 1, args[i]);
			}
			// 执行
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.releaseDB(connection, preparedStatement, null);
		}
	}

	/**
	 * 查看是否存在该用户名
	 * 
	 * @param sql
	 * @param username
	 * @return
	 */
	public String getUsername(String sql, String username) {

		String usernameTemp = null;

		try {
			connection = JDBCUtils.getConnection();

			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, username);
			// 获取结果集
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				usernameTemp = resultSet.getString("username");
				System.out.println(usernameTemp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBCUtils.releaseDB(connection, preparedStatement, resultSet);
		}
		return usernameTemp;
	}

}
