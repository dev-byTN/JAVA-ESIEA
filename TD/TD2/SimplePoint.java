package TD.TD2;

public class SimplePoint {
    
    private char name;
    private double value;
    
    public SimplePoint(char name, double value) {
        
        this.name = name;
        this.value = value;
    }
    
    public void display() {
        System.out.println("Nom: " + this.name + " abscisse: " + this.value);
    }
        
    public void translate(double argument) {
        
        this.value += argument;
    }
    public String toString(){
        return name+": "+ value;
    }

    public static void main(String[] args) {
        
        SimplePoint p = new SimplePoint('P', -11.3);
        p.display();
        p.translate(2.5);
        p.display();

        SimplePoint a = new SimplePoint('A', 5.5);
        SimplePoint b = new SimplePoint('B', 4.5);
        System.out.println("The points are: " + a + " " + b);
    }
}
