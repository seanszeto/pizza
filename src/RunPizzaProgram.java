import java.text.CharacterIterator;

public class RunPizzaProgram {
    public static void main(String[] args){
        RunPizzaProgram runPizza = new RunPizzaProgram();
    }

    public RunPizzaProgram(){
        Pizza pepperoni;
        pepperoni = new Pizza(6,"pepperoni","");
        pepperoni.printInfo();

        Pizza hawaiian;
        hawaiian = new Pizza(10,"hawaiian","no");
        hawaiian.printInfo();
    }
}
