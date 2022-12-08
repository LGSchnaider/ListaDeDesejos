package modelo;

import java.util.ArrayList;

public interface IPessoaDAO {

	public boolean inserir(Pessoa p);

	public boolean alterar(Pessoa p, Long id);

	public boolean deletar(Pessoa p, Long id);

	public ArrayList<Pessoa> listarDesejos();

}
