package controle;

import java.util.ArrayList;

import modelo.IUsuarioDAO;
import modelo.Pedido;
import modelo.Pedido;

public class UsuarioDAO implements IUsuarioDAO {

	private static ArrayList<Pedido> pedidos;
	private static UsuarioDAO instancia;

	private UsuarioDAO() {
	}

	public static UsuarioDAO getInstancia() {

		if (instancia == null) {
			instancia = new UsuarioDAO();
			pedidos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pedido p) {

		if (p != null) {
			pedidos.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pedido p, Long id) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId() == id) {
//				desejo.set
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(Pedido p, Long id) {

		for (Pedido pessoa : pedidos) {
			if (pessoa.getId() == id) {
				pedidos.remove(pessoa);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Pedido> listarDesejos() {
		return pedidos;
	}

}
