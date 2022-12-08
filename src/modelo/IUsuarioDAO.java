package modelo;

import java.util.ArrayList;

public interface IUsuarioDAO {

	public boolean inserir(Pedido p);

	public boolean alterar(Pedido p, Long id);

	public boolean deletar(Pedido p, Long id);

	public ArrayList<Pedido> listarDesejos();

}
