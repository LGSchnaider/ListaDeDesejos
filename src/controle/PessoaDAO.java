package controle;

import java.util.ArrayList;

import modelo.Pessoa;
import modelo.IPessoaDAO;

public class PessoaDAO implements IPessoaDAO {

	private static ArrayList<Pessoa> pessoas;
	private static PessoaDAO instancia;

	private PessoaDAO() {
	}

	public static PessoaDAO getInstancia() {

		if (instancia == null) {
			instancia = new PessoaDAO();
			pessoas = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pessoa p) {

		if (p != null) {
			pessoas.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pessoa p, Long id) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId() == id) {
//				desejo.set
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(Pessoa p, Long id) {

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getId() == id) {
				pessoas.remove(pessoa);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Pessoa> listarDesejos() {
		return pessoas;
	}

}
