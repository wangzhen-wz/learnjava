package com.monkey1024.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * ��һ��jdbc����
 *
 */
public class JDBC_Test01 {

	public static void main(String[] args) throws Exception {
//		ע������
		Class.forName("com.mysql.jdbc.Driver");
//		��ȡ����Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monkey1024", "root", "monkey1024");
//		�õ�ִ��sql���Ķ���Statement
		Statement stmt = conn.createStatement();
//		ִ��sql��䣬�����ؽ��
		ResultSet rs = stmt.executeQuery("select id,name,password,email,birthday from t_user");
//		������
		while(rs.next()){
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("name"));
			System.out.println(rs.getObject("password"));
			System.out.println(rs.getObject("email"));
			System.out.println(rs.getObject("birthday"));
			System.out.println("------------");
		}
//		�ر�Connection
		rs.close();
		stmt.close();
		conn.close();
	}

}
