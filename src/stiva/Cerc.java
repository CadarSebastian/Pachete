package stiva;

import java.util.Objects;

public class Cerc extends FiguraGeometrica {
 private int raza;

	public Cerc(int x, int y,int raza) {
		super(x, y);
		this.raza=raza;
		
	}

	public int getRaza() {
		return raza;
	}

	@Override
	public String toString() {
		return "Cerc :("+getX()+getY()+") * "+getRaza();
	}

	@Override
	public int hashCode() {
		return Objects.hash(raza);
	}

	public boolean equals(Cerc c) {
		if (getX()==c.getX() && getY()==c.getY() && getRaza()==c.getRaza())
			return true;
		else 
			return false;
	}

}
