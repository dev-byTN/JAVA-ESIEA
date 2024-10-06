public class Pixels { 
    
    static class Pixel {
    
        private int red, blue, green;

        public Pixel() {  
            red = 0;
            blue = 0;
            green = 0;
        }
        public void changeColor (int r, int b, int g) {
            red = r;
            blue = b;
            green = g;
        }
    }


	public static void main (String[] args) {

        Pixel[][] myColor = new Pixel[8][1];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 1; j++) { 

                myColor[i][j] = new Pixel();
                myColor[i][j].changeColor(255, 0, 0);
            }
        }

        for ( int i = 0; i < 8; i ++) {
            for ( int j = 0; j < 1; j ++) {

                System.out.println(myColor[i][j].red + " " + myColor[i][j].blue + " " + myColor[i][j].green);
            }
        }

	}
}