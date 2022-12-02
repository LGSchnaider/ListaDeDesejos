package modelo;

import java.util.ArrayList;

public interface IDesejoControl {

	public boolean inserir(Desejo p);

	public boolean alterar(Desejo p, Long id);

	public boolean deletar(Desejo p, Long id);

	public ArrayList<Desejo> listarDesejos();

}
