package com.monkey1024.jdbc.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.monkey1024.jdbc.bean.User;
import com.monkey1024.jdbc.util.DBUtil;

public class LoginService {

	public User findUserByNameAndPassword(String name, String password) {
		User u = null;
		String sql = "select id,name,password,email,birthday from t_user where name='" + name + "' and password='" + password + "'";
		System.out.println(sql);
		// 获取连接Connection
		try (Connection conn = DBUtil.getConnection();
				// 得到执行sql语句的对象Statement
				Statement stmt = conn.createStatement();
				// 执行sql语句，并返回结果
				ResultSet rs = stmt.executeQuery(sql)) {

			// 处理结果
			while (rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setBirthday(rs.getDate("birthday"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}
}
