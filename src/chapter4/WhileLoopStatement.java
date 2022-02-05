package chapter4;

public class WhileLoopStatement {
    public static void main(String[]args) {

        //Nested Loops
        int hungryHippopotamus = 8;
        while(hungryHippopotamus>0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus>5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus+", ");
        }


    }
}
