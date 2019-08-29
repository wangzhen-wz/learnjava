package com.monkey1024.jdbc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.monkey1024.jdbc.bean.User;
import com.monkey1024.jdbc.util.DBUtil;

public class LoginServiceNew {

	public User findUserByNameAndPassword(String name, String password) {
		User u = null;
		String sql = "select id,name,password,email,birthday from t_user where name=? and password=?";
		System.out.println(sql);
		// ��ȡ����Connection
		try (Connection conn = DBUtil.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, name);
			stmt.setString(2, password);

			try (// ִ��sql��䣬�����ؽ��
					ResultSet rs = stmt.executeQuery()) {
				// ������
				while (rs.next()) {
					u = new User();
					u.setId(rs.getInt("id"));
					u.setName(rs.getString("name"));
					u.setPassword(rs.getString("password"));
					u.setEmail(rs.getString("email"));
					u.setBirthday(rs.getDate("birthday"));
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return u;
	}
}
