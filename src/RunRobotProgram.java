public class RunRobotProgram {
    public static void main(String[] args){
        RunRobotProgram runRobot = new RunRobotProgram();
    }

    public RunRobotProgram(){
        Robot ludwig;
        ludwig = new Robot('s', 200, 10, 180, "square");
        ludwig.printInfo();

        Robot jerry;
        jerry = new Robot('l', 30, 255, 120, "triangle");
        jerry.printInfo();
    }

}
