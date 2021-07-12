package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Locale.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import died.estructuras.grafos.Grafo;

public class App {
	
	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/died","root","root");
//			Statement stmt1 = conn.createStatement();
//			stmt1.execute("CREATE TABLE AUTOR ( ID INT, NOMBRE VARCHAR(45) )");
////			for(int i = 1;i<4;i++) {
////				stmt.setInt(1, i);
////				stmt.executeUpdate();
////			}
//			PreparedStatement stmt = conn.prepareStatement("SELECT ID,NOMBRE FROM LIBRO WHERE ID BETWEEN ? AND ?");
//			stmt.setInt(1, 30);
//			stmt.setInt(2, 700);
//			ResultSet rs = stmt.executeQuery();
//			while(rs.next()) {
//				String nombre = rs.getString(2);
//				Integer id = rs.getInt("ID");
//				System.out.println("Lei el libro de nombre: "+nombre+" de id "+id);
//			}
//			rs.close();
//			stmt.close();
//			conn.close();
//			conn.setAutoCommit(false);
//			// insert1 
//			// injsert 2
//			if(false) conn.rollback();
//			else conn.commit();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		Month month = Month.of(Integer.valueOf("06"));
		Locale locale = new Locale("es", "ES");
		System.out.println(month.getDisplayName(TextStyle.FULL, locale));
		System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
		System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
	}

}
