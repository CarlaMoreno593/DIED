package db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	private static final String url ="jdbc:h2:~/taller;AUTO_SERVER=TRUE;FILE_LOCK=SOCKET";
	private static final String user="taller";
	private static final String pass="taller";

	private DB(){
			// no se pueden crear instancias de esta clase
	}

	public static Connection get(){
		Connection conn=null;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return conn;
	}
}
