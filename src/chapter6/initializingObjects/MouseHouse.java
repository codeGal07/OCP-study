package chapter6.initializingObjects;

public class MouseHouse {
    private final int volume;
    private final String type;
    {
        volume = 10;
    }
    public MouseHouse(String type) {
        this.type = null;

    }
    public MouseHouse() { // DOES NOT COMPILE
      this(null);
//        this.type = "pe";
    }



//    private final int volume;
//    private  int volume1;
//    private final String name;
//    private static int a;
//
//    private final String lala;
//
//
//    public MouseHouse() {
//        this.name = "Empty House"; // Constructor assignment
//        this.lala = "1";
//    }
//
//    public MouseHouse(String str) {
//        this.name = "Empty House"; // Constructor assignment
//        this.lala = "1";
//    }
//
//    {
//        volume = 10; // Instance initializer assignment
//    }
//
//    public void someMethod() {
//        final int neki;
//    }


    public static void main(String[] args) {
        new MouseHouse();
    }
}
