public class TrafficLights {

    public static void main(String[] args) {
        
        TraffLight test = new TraffLight();
        System.out.println(test.changeColor());

    }
}


class TraffLight {

    int color = 0;

    int changeColor() {

        this.color += 1;
        if (this.color > 2 | this.color < 0) {
            this.color = 0;
        }
        return color;
    }
}