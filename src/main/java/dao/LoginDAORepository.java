package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.SingleConnectionBanco;
import model.Login;

public class LoginDAORepository {
	
	private Connection connection;
	
	public LoginDAORepository() {
		connection = SingleConnectionBanco.getConnection();
	}
	
	public boolean validarAutenticacao(Login login) throws SQLException {
		
			String sql = "select * from model_login where login = ? and senha = ?" ;
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setString(1, login.getLogin());
			statement.setString(2, login.getSenha());
			ResultSet resultSet = statement.executeQuery();
			
			if(resultSet.next()) {
				return true; /* Autenticado */
			}
			
			return false; /*não autenticado */	
		
	}

}
