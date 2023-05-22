package stiva;

import java.util.LinkedList;
import java.util.Iterator;
import stiva.exceptii.ElementDuplicat;
import stiva.exceptii.StivaGoala;
import stiva.exceptii.StivaNegativa;

public class Stiva {
	private int dim;
	private LinkedList<FiguraGeometrica> figuri;
	
	public Stiva(int dim)throws StivaNegativa {
		if(dim<=0)
			throw new StivaNegativa(dim);
		this.dim=dim;
		figuri= new LinkedList<FiguraGeometrica>();
	}
	public boolean adaugaFigura(FiguraGeometrica fig) throws ElementDuplicat {
		for(FiguraGeometrica f : figuri) {
			if(f.equals(fig))
				throw new ElementDuplicat(fig);
		}
		figuri.addLast(fig);
		return true;
	}
	public  boolean returnare(FiguraGeometrica fig)throws StivaGoala {
		if(figuri.size()==0)
			throw new StivaGoala("Stiva este goala");
		else {figuri.getLast();
			figuri.removeLast();
		}
		return true;
	}
	public  void  afisStiva() {
		Iterator<FiguraGeometrica> descenIterator=figuri.descendingIterator();
		while(descenIterator.hasNext()) {
			FiguraGeometrica element=descenIterator.next();
		  System.out.println(element);
		}
	}
}
