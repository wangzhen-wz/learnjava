package com.monkey1024.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.monkey1024.jdbc.bean.User;

/**
 * ʹ��jdbcʵ����ɾ��
 *
 */
public class CRUD_Test01 {
	
	@Test
	public void testInsert() throws Exception{
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//��ȡ����Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monkey1024", "root", "monkey1024");
		
		//�õ�ִ��sql���Ķ���statement
		Statement stmt = conn.createStatement();
		
		//ִ��sql��䣬���õ����ؽ��
		int flag = stmt.executeUpdate("insert into t_user(name,password,email,birthday) values ('cat','123456','cat@163.com','1993-11-11')");
		if(flag > 0){
			System.out.println("�ɹ�");
		}
		
		//�ر���Դ
		stmt.close();
		conn.close();
	}
	
	@Test
	public void testUpdate() throws Exception{
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//��ȡ����Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monkey1024", "root", "monkey1024");
		
		//�õ�ִ��sql���Ķ���statement
		Statement stmt = conn.createStatement();
		
		//ִ��sql��䣬���õ����ؽ��
		int flag = stmt.executeUpdate("update t_user set password='123' where name='cat'");
		if(flag > 0){
			System.out.println("�ɹ�");
		}
		
		//�ر���Դ
		stmt.close();
		conn.close();
	}
	
	@Test
	public void testDelete() throws Exception{
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		
		//��ȡ����Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monkey1024", "root", "monkey1024");
		
		//�õ�ִ��sql���Ķ���statement
		Statement stmt = conn.createStatement();
		
		//ִ��sql��䣬���õ����ؽ��
		int flag = stmt.executeUpdate("delete from t_user where name='cat'");
		if(flag > 0){
			System.out.println("�ɹ�");
		}
		
		//�ر���Դ
		stmt.close();
		conn.close();
	}
	
	@Test
	public void testSelect(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// ע������
			Class.forName("com.mysql.jdbc.Driver");
			// ��ȡ����Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monkey1024", "root", "monkey1024");
			// �õ�ִ��sql���Ķ���Statement
			stmt = conn.createStatement();
			// ִ��sql��䣬�����ؽ��
			rs = stmt.executeQuery("select id,name,password,email,birthday from t_user");
			// ������
			List<User> userList = new ArrayList<>();
			while (rs.next()) {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setBirthday(rs.getDate("birthday"));
				userList.add(u);
			}
			System.out.println(userList);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			// �ر�Connection
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
