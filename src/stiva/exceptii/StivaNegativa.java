package stiva.exceptii;

public class StivaNegativa extends Exception {
	private int dim;
	public StivaNegativa(int dim) {
		super("Stiva nu poate avea dimensiune negativa" + dim + " este valoare invalida.");
		this.dim=dim;
	
	}

}
