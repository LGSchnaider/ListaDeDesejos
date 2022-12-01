package modelo;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Produto {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//private String getDateTime() {
		//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Date date = new Date();
		//return dateFormat.format(date);
	//}
}
