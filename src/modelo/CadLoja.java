package modelo;

public class CadLoja {
	private String Loja;
	private String Cidade;
	private String Produto;
	
	public String getLoja() {
		return Loja;
	}
	public String getCidade() {
		return Cidade;
	}
	public String getProduto() {
		return Produto;
	}
	
	
	public	void setLoja(String Loja) {
		this.Loja =Loja;
	}
	public	void setCidade(String Cidade) {
		this.Cidade = Cidade;
	}
	public	void setProduto(String Produto) {
		this.Produto = Produto;
	}
}
