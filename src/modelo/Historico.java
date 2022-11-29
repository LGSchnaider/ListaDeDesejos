package modelo;

public class Historico {
	private String NomeP;
	private String Marca;
	private String EstOrigin;
	private Double Valor;
	private int Data;
	private String Categoria;
	
	public String getNome(){
		return NomeP;
	}
	public String getMarca(){
		return Marca;
	}
	public String getEstOrigin(){
		return EstOrigin;
	}
	public String getCategoria(){
		return Categoria;
	}
	public Double getValor(){
		return Valor;
	}
	public int getData(){
		return Data;
	}
	
	
	public void setNome(String NomeP) {
		this.NomeP = NomeP;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	public void setEstOrigin(String EstOrigin) {
		this.EstOrigin = EstOrigin;
	}
	public void setCategoria(String Categoria) {
		this.Categoria = Categoria;
	}
	public void setData(int Data) {
		this.Data = Data;
	}
	public void setValor(Double Valor) {
		this.Valor = Valor;
	}
}
