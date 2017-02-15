package gerenciamentodetarefas.testes;

import classes.User;

import java.sql.SQLException;

import classes.ConnectionMysql;

public class Main {
	public static void main(String args[]) throws SQLException{
		User user = new User("João Batista Gomes Silva", "jhonxbatista@gmail.com");
		ConnectionMysql connection = new ConnectionMysql("tasks", "root", "g3d1te2016");
		connection.connect();
	}
}
