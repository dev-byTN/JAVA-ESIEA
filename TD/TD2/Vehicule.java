package TD.TD2;

public class Vehicule {

    private String maker;
    private String model;
    
    public Vehicule( String maker, String model) {
        
        this.maker = maker;
        this.model = model;
    }
    
    public String toString() {
        return maker + "," + model;
    }
}

class Train extends Vehicule {
    private String country;
    
    public Train(String maker, String model, String country) {
        super(maker,model);
        this.country = country;
    }
    public String toString() {
        return super.toString() + "," +country;
    }
}

class Car extends Vehicule {
    
    private int year;
    
    public Car(String maker, String model, int year) {
        super(maker,model);
        this.year = year;
    }
    public String toString() {
        return super.toString() + "," + year;
    }

    public static void main(String[] args) {
        
        Vehicule car = new Car("Toyota", "Camry", 2022);
    }
}

