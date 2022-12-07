package modelo;

import java.util.ArrayList;

public class Produto {
	ArrayList<String> nomesProdutos = new ArrayList(); 
	private String nome;
	private String valor;
	private String data;

	public String getNome() {
		return nome;
	}
	
	public String getValor() {
		return valor;
	}
	
	public String getData() {
		return data;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void salvaDados(String nome) {
		
	}
	
	
	
	// private String getDateTime() {
	// DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	// Date date = new Date();
	// return dateFormat.format(date);
	// }
}
