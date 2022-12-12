package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Usuario> usuarios;
	private static UsuarioDAO instancia;

	private UsuarioDAO() {
	}

	public static UsuarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			usuarios = new ArrayList<>();
		}
		Usuario u = new Usuario();
		u.setCpf(123);
		u.setNome("Luiz");
		u.setLogin("lg");
		u.setSenha("123");
		
		usuarios.add(u);

		return instancia;
	}

	@Override
	public boolean inserir(Usuario usuario) {
		if (usuario != null) {
			usuarios.add(usuario);
			return true;
		}
		return false;
	}

	@Override
	public Usuario efetuarLogin(String login, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
				return usuario;
			}
		}
		return null;
	}

}
