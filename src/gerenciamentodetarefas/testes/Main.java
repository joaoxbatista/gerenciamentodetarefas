package gerenciamentodetarefas.testes;

import classes.User;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import classes.ConnectionMysql;
import dao.UserDao;

public class Main {
	public static void main(String args[]) throws Exception{
		UserDao user = new UserDao();
		user.listar();
		
		String name = JOptionPane.showInputDialog("Insira seu nome");
		String email = JOptionPane.showInputDialog("Insira seu e-mail");
		User jose = new User(name, email);
		user.cadastrar(jose);
	}
}
