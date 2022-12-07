package modelo;

public class Desejo {

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private String Nome;
	private String Marca;
	private String Valor;
	private String Data;
	
	public String getNome() {
		return Nome;
	}
	public String getMarca() {
		return Marca;
	}
	
	public String getValor() {
		return Valor;
	}
	public String getData() {
		return Data;
	}
	
	
	public	void setNome(String Nome) {
		this.Nome =Nome;
	}
	public	void setMarca(String Marca) {
		this.Marca = Marca;
	}
	
	public	void setValor(String Valor) {
		this.Valor =Valor;
	}
	public	void setData(String Data) {
		this.Data = Data;
	}
}
