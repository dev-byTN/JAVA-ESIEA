package TD.TD2;

public class Vector3d {
    
    public double x,y,z;
    
    public Vector3d ( double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void display() {
        System.out.println( "<" + x +", " + y+ ", " + z+ ">");
    }

    public String toString() {
        return "<" + x +", " + y+ ", " + z+ ">";
    }
    
    public double norm() {
        
        x = Math.pow(x, 2);
        y = Math.pow(y,2);
        z = Math.pow(z,2);

        double sqr = Math.sqrt(x+y+z);
        return sqr;
    }

    public static Vector3d addition(Vector3d vector1, Vector3d vector2) {

        Vector3d vector3 = new Vector3d(0, 0, 0);

        vector3.x = vector1.x + vector2.x;
        vector3.y = vector1.y + vector2.y;
        vector3.z = vector1.z + vector2.z;

        return vector3;
    }

    public double scalarProduct(Vector3d vector2) {

        double scalar = x*vector2.x + y*vector2.y + z*vector2.z;

        return scalar;
    }

    public static void main(String[] args) {
        
        var v = new Vector3d (1.1, 2.2, 3.3);
        System.out.println(v);
        v.display();

        v = new Vector3d (4., 0., 3.);
        System.out.println(v.norm());

        var v1 = new Vector3d (1.1, 2.2, 3.3);
        var v2 = new Vector3d (1.0, 2.0, 3.0);
        System.out.println(Vector3d.addition(v1,v2));

        v1 = new Vector3d (3, 2, 5);
        v2 = new Vector3d (1, 2, 3);
        System.out.println(v1.scalarProduct(v2));
    }
}
