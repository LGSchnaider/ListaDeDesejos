package controle;

import java.util.ArrayList;

import modelo.Desejo;
import modelo.IDesejoControl;

public class DesejoControl implements IDesejoControl {

	private static ArrayList<Desejo> desejos;
	private static DesejoControl instancia;

	private DesejoControl() {
	}

	public static DesejoControl getInstancia() {

		if (instancia == null) {
			instancia = new DesejoControl();
			desejos = new ArrayList<>();
		}

		return instancia;
	}

	@Override
	public boolean inserir(Desejo p) {

		if (p != null) {
			desejos.add(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean alterar(Desejo p, Long id) {
		for (Desejo desejo : desejos) {
			if (desejo.getId() == id) {
//				desejo.set
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletar(Desejo p, Long id) {

		for (Desejo desejo : desejos) {
			if (desejo.getId() == id) {
				desejos.remove(desejo);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Desejo> listarDesejos() {
		return desejos;
	}

}
