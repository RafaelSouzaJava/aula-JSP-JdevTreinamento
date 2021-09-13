package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionBanco {
	
	private static String url="jdbc:postgresql://localhost:5432/aula_jpa?autoReconnect=true";
	private static String user= "postgres";
	private static String password= "Kill4r3e2w1q#";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnectionBanco() { /*Quando tiver uma instancia vai conectar*/
		conectar();
	}
	
	private static void conectar() {
		try {
			if (connection == null) {
				Class.forName("org.postgresql.Driver"); /* Carrega o Driva de conexão com o banco */
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);/*para não efetuar alterações no banco sem nosso comando*/
				System.out.println("Conexão estabelecida");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
