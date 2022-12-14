package controle;

import java.util.ArrayList;

import modelo.IProdutoDAO;
import modelo.Pessoa;
import modelo.Produto;

public class ProdutoDAO implements IProdutoDAO {

	private static ArrayList<Produto> produtos;
	private static ProdutoDAO instancia;

	/**
	 * Padrao singleton
	 */
	private ProdutoDAO() {
	}

	public static ProdutoDAO getInstancia() {

		if (instancia == null) {
			instancia = new ProdutoDAO();
			produtos = new ArrayList<>();

			Produto p1 = new Produto();
			p1.setNome("Bola");
			p1.setCategoria("Brinquedo");
			p1.setValor(30.00);

			Produto p2 = new Produto();
			p2.setNome("Carrinho de controle remoto");
			p2.setCategoria("Brinquedo");
			p2.setValor(120.00);

			Produto p3 = new Produto();
			p3.setNome("Kinder ovo");
			p3.setCategoria("Alimento");
			p3.setValor(8.00);

			produtos.add(p1);
			produtos.add(p2);
			produtos.add(p3);
		}

		return instancia;
	}

	public ArrayList<Produto> listarProduto() {
		return produtos;
	}

	@Override
	public boolean inserir(Produto p) {
		if (p != null) {
			produtos.add(p);
			return true;
		}
		return false;
	}
	
	
	public void deletar(int p) {
		produtos.remove(p);
	}

}
