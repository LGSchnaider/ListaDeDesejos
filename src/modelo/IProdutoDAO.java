package modelo;

import java.util.ArrayList;

public interface IProdutoDAO {

	public ArrayList<Produto> listarProduto();

	public boolean inserir(Produto p);

}
