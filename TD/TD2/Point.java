package TD.TD2;

public class Point {
	private int abscissa;
	private int ordinate;
	
	public Point (int a, int o) {
		this.abscissa = a;
		this.ordinate = o;
	}

	public void setAbscissa(int abs) {
	    abscissa = abs;
	}
	
	public void setOrdinate(int ord) {
	    ordinate = ord;
	}
	
	public int getAbscissa() {
	    return abscissa;
	}
	
	public int getOrdinate() {
	    return ordinate;
	}

    public static void main(String[] args) {
        
        Point p = new Point(1,2);
        p.setAbscissa(2);
        p.setOrdinate(4);
        System.out.println(p.getAbscissa());
        System.out.println(p.getOrdinate());
    }
	
}