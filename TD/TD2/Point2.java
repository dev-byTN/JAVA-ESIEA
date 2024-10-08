package TD.TD2;

public class Point2 { 

	private int x, y;	//abscissa and ordinate 

    public Point2 (int abs, int ord)  { 
        x = abs; 
        y = ord;
    } 

    public void translate (int d) {
        x += d; 
        y += d; 
    } 
  
    public String toString() {
        return "[" + x + "," + y + "]";
    }
    public int getX() { 
        return x; 
    } 

    public int getY() { 
        return y; 
    } 

    
}

class Point3d extends Point2 {

    private int z;

    public Point3d(int x, int y, int z) {

        super(x, y);
        this.z= z;
    } 

    public int getZ() {
        return z;
    }

    public int setZ(int value) {
        z = value;
        return z;
    }

    public String toString() {
        return super.toString() + "[" + z + "]";
    }

    public void translate(int d) {

        super.translate(d);
    }
}