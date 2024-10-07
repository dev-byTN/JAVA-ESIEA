package TD.TD2;
import java.time.LocalDate;

public class Physicist {
    private String name;
    public LocalDate birth_date;
    private String location;

    public Physicist ( String name, LocalDate date, String location) {
        this.name = name;
        this.location = location;
        birth_date = date;
    }
    
    public Physicist ( String name, LocalDate date) {
        this.name = name;
        this.location = null;
        birth_date = date;
    }
    
    public Physicist ( String name) {
        this.name = name;
        this.location = null;
        birth_date = null;
    }
    
    public String toString() {
        if ( name!= null && birth_date != null && location!= null) return name +"," + birth_date + "," + location;
        else if (name != null && birth_date != null && location == null) return name + "," + birth_date;
        else return name;
    }
    
    public void setBirthDate(LocalDate newDate) {
        if (newDate.isAfter(LocalDate.now()) || newDate.isBefore(LocalDate.parse("2000-01-01"))) newDate = null;
        birth_date = newDate;
    }
    
    public static void main(String[] args) {
        
        Physicist phy1 = new Physicist("Albert Einstein", LocalDate.of(1879, 3, 14), "Germany");
        System.out.println(phy1);

        	
        Physicist phy4 = new Physicist("Thomas Edison", LocalDate.of(1846, 2, 11), "United States");
        System.out.println(phy4);
        phy4.setBirthDate(LocalDate.of(1847, 2, 11));
        System.out.println(phy4);
    }
}