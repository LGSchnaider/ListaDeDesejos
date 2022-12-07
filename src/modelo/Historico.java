package modelo;

public class Historico {
	private String NomeP;
	private Double Valor;
	private int Data;
	
	public String getNome(){
		return NomeP;
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

	
	public void setData(int Data) {
		this.Data = Data;
	}
	public void setValor(Double Valor) {
		this.Valor = Valor;
	}
}
