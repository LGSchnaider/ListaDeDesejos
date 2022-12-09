package controle;

import java.util.ArrayList;

import modelo.IPedidoDAO;
import modelo.Pedido;

public class PedidoDAO implements IPedidoDAO {

	private static ArrayList<Pedido> tabelaPedidos;
	private static PedidoDAO instancia;

	private PedidoDAO() {
	}

	public static PedidoDAO getInstancia() {

		if (instancia == null) {
			instancia = new PedidoDAO();
			tabelaPedidos = new ArrayList<>();
			
			
		}

		return instancia;
	}

	@Override
	public boolean inserir(Pedido p) {
		if (p != null) {
			tabelaPedidos.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Pedido p) {
		for (Pedido pedido : tabelaPedidos) {

//			if (pedido.getCpf() == cpf) {
//				pessoa.setNome(p.getNome());
//				return true;
//			}
		}
		return false;
	}

	@Override
	public boolean excluir(Pedido p) {
		for (Pedido pedido : tabelaPedidos) {
			return tabelaPedidos.remove(pedido);
		}

		return false;
	}

	@Override
	public ArrayList<Pedido> listarPedidos() {
		return tabelaPedidos;
	}

	@Override
	public Pedido buscaPedidoPorId(Long idPedido) {
		// TODO Auto-generated method stub
		return null;
	}

}
