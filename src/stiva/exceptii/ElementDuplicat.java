package stiva.exceptii;

import stiva.FiguraGeometrica;

public class ElementDuplicat extends Exception {
	private FiguraGeometrica figuraDuplicata;
	public ElementDuplicat(FiguraGeometrica figuraDuplicata) {
		super("Elemenetul: "+figuraDuplicata+"este deja stocat.");
		
	}
}
