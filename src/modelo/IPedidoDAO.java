package modelo;

import java.util.ArrayList;

public interface IPedidoDAO {
	
	public boolean inserir(Pedido p);

	public boolean alterar(Pedido p);

	public boolean excluir(Pedido p);

	public ArrayList<Pedido> listarPedidos();
	
	public Pedido buscaPedidoPorId(Long idPedido);

}
