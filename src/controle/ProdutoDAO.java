package controle;

import java.util.ArrayList;

import modelo.Produto;

public class ProdutoDAO {

	private static ArrayList<Produto> produtos;
	private static ProdutoDAO instancia;

	private ProdutoDAO() {
	}

	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();
			produtos = new ArrayList<>();
			
			Produto p1 = new Produto();
			p1.setNome(null);
			p1.setPreco(null);
			
			Produto p2 = new Produto();
			p1.setNome(null);
			p1.setPreco(null);
			
			Produto p3 = new Produto();
			p1.setNome(null);
			p1.setPreco(null);
			
			produtos.add(p1);
			produtos.add(p2);
			produtos.add(p3);
		}

		return instancia;
	}

}
