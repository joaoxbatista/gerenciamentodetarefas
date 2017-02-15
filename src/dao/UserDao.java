package dao;
import classes.ConnectionMysql;
import classes.User;
import java.sql.PreparedStatement;
public class UserDao {
	private ConnectionMysql connection = new ConnectionMysql();
	
	public UserDao(){
	}
	
	//Cadastrar Usuário
	public void cadastrar(User usuario) throws Exception{
		PreparedStatement query = "insert into ";
	}
	
	//Editar Usuário
	//Deletar Usuário
	//Procurar Usuário
	//Listar todos os Usuários
	
	
}
