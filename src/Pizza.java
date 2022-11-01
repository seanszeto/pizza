public class Pizza {
    // 10" large pepperoni, with sauce
    // 6" small hawaiian, with no sauce

    public int diameter;
    public String type;
    public String sauce;

    public Pizza(int pDiameter, String pType, String pSauce){
        diameter = pDiameter;
        type = pType;
        sauce = pSauce;
    }

    public void printInfo(){
        System.out.println("The pizza has a diameter of " + diameter + " inches.");
        System.out.println("It is a " + type + " pizza.");
        System.out.println("It has " + sauce + " sauce.");
    }
}
