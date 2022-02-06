package chapter4;

public class IfStatement {
    public static void main(String [] args) {

        int temperature = 4;
        long humidity = 8;
        if (temperature==100)
            if (humidity < 6)
                System.out.println("Too Low");
            else System.out.println("Just Right");
            //? this else is from outer if statement
        else System.out.println("Too High");

    }
}
