package stiva;

public class Patrat extends FiguraGeometrica {
int x1;
int y1;
int arie=0;
	public Patrat(int x, int y,int x1,int y1) {
		super(x, y);
		this.x1=x1;
		this.y1=y1;
	}
	
	public int getY1() {
		return y1;
	}
	public int getArie() {
		 return arie=getY1()-getY()*(getY1()-getY());
	}
	@Override
	public String toString() {
		return "Patrat :("+getX()+getY()+") cu aria "+ getArie();
	}
	public boolean equals(Patrat p) {
		if (getX()==p.getX() && getY()==p.getY() && getArie()==p.getArie() )
			return true;
		else 
			return false;
	}
}
