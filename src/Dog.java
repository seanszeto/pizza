public class Dog {
    public double age;
    public boolean status;
    public int legs;
    public String name;

    public Dog(){
        age = 3.2;
        status = true;
        legs = 4;
        name = "Snowbol";

    }
    public void printInfo() {
        System.out.println("The dog is" + age + "years old");
        System.out.println("The dog is" + status);
        System.out.println("The dog has" + legs + "legs");
        System.out.println("The dog is called" + name);
    }
}
