public class TrafficLights2 {
    public static void main(String[] args) {
        
        TraffLight2 test = new TraffLight2();
        TraffLight2 test2 = new TraffLight2(3);

        System.out.println(test.color);
        System.out.println(test2.color);
    }
}

class TraffLight2 {
    
    int color;

    public TraffLight2() {

        this.color = 0;
    }

    public TraffLight2( int colorType ) {

        this.color = colorType;
    }
}


