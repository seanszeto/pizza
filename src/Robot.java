public class Robot {
    public char size;
    public int red;
    public int green;
    public int blue;
    public String shape;

    // constructor method
    public Robot(char pSize, int pRed, int pGreen, int pBlue, String pShape){
        size = pSize;
        red = pRed;
        green = pGreen;
        blue = pBlue;
        shape = pShape;
    }

    // printInfo method
      public void printInfo() {
        System.out.println("The robot is size " + size);
        System.out.println("The robot is shape " + shape);
    }
}
