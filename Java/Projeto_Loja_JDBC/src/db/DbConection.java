package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DbConection {
private static Connection conn;
private static final String username = "root";
private static final String password = "root";
private static final String Database_url = "jdbc:mysql://localhost:3306/loja";
	
public static Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(Database_url, username, password);
		  } catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	
}

public static void fechar() {
	if (conn != null) {
		try {
			conn.close();
		} catch (SQLException s) {
			throw new DbException(s.getMessage());
		}

	}

 }
}
