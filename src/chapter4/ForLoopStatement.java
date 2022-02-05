package chapter4;

public class ForLoopStatement {
    public static void main(String[] args) {

        //multiple terms to the for statement
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " "); }
        System.out.print(x + " ");

//        ?The variables in the initialization block must all be of the same type.
//        int x = 0;
//        for(long y = 0, int z = 4; x < 5; x++) { // DOES NOT COMPILE
//            System.out.print(y + " ");
//        }

//      *for each example
        String[] names = new String[3];
        for(String name : names) { // DOES COMPILE outputs null null null
            System.out.print(name + " ");
        }

        // we can label loops
        // it is useful if we have break statement. We can write "Break OUTER_LOOP" and it will
        // break out of a higher-level outer loop
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

//      for() //Does not compile
        for (; ; ) //! this is an infinite loop that will print the same statement repeatedly
            System.out.println("lala");
    }
}
