package modelo;

public interface IUsuarioDAO {

	public boolean inserir(Usuario usuario);

	public Usuario efetuarLogin(String nome, String senha);

}
