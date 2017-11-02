package com.neuedu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 1.�������ݿ��������� 2.������ݿ�����
 * 
 * Ҫ�����д�ɵ���ģʽ ���㿪��ԭ��
 * 
 * @author ttc
 * 
 */
public class DButil {

	private static DButil util;
	private String driver;
	private String url;
	private String username;
	private String password;

	// ������˽��
	private DButil() {
		// ���������ļ�
		try {
			Properties pr = new Properties();
			pr.load(this.getClass().getClassLoader().getResourceAsStream(
					"db.properties"));
			driver = pr.getProperty("driver");
			url = pr.getProperty("url");
			username = pr.getProperty("username");
			password = pr.getProperty("password");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public synchronized static DButil getInstance() {
		if (null == util) {
			util = new DButil();

		}

		return util;
	}

	public  Connection getConnection() throws Exception {
//
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:neuedu", "scott", "tiger");
        Class.forName(driver);
        Connection conn =DriverManager.getConnection(url,username,password);
		return conn;

	}

	// �ر�����
	public void close(Connection conn) {
		if (null != conn) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// �ر��������
	public void close(PreparedStatement ps) {
		if (null != ps) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// �رս����
	public void close(ResultSet rs) {
		if (null != rs) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void close(Statement st) {
		if (null != st) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}