package modelo;

import java.util.ArrayList;

public class Produto {
	ArrayList<String> nomesProdutos = new ArrayList(); 
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void salvaDados(String nome) {
		
	}
	
	
	
	// private String getDateTime() {
	// DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	// Date date = new Date();
	// return dateFormat.format(date);
	// }
}
