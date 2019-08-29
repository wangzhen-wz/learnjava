package com.monkey1024.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 第一段jdbc代码
 *
 */
public class JDBC_Test01 {

	public static void main(String[] args) throws Exception {
//		注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		获取连接Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/monkey1024", "root", "monkey1024");
//		得到执行sql语句的对象Statement
		Statement stmt = conn.createStatement();
//		执行sql语句，并返回结果
		ResultSet rs = stmt.executeQuery("select id,name,password,email,birthday from t_user");
//		处理结果
		while(rs.next()){
			System.out.println(rs.getObject("id"));
			System.out.println(rs.getObject("name"));
			System.out.println(rs.getObject("password"));
			System.out.println(rs.getObject("email"));
			System.out.println(rs.getObject("birthday"));
			System.out.println("------------");
		}
//		关闭Connection
		rs.close();
		stmt.close();
		conn.close();
	}

}
