package chapter6.callingSuperReference2;

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;
//    String label = "v beetle";


    public void printData() {
        System.out.println("this: " + this.label); //if there is no label in beetle class, "this" returns value from super class
        System.out.println("super: " + super.label);
        System.out.println("without: " + label);
        System.out.println("only in super class: "+ onlyInInsect);
//        System.out.println(numberOfLegs);
    }

    //zmeraj gre gledat čedalje višje, če ni te ko je mišljeno dokler ne najde (ne deluje v obratno smer)
    // če ni this, gre gledat super,
    // če ni label gre gledat v this, če ni, gre gledat v super


    public static void main(String[] n) {
        new Beetle().printData();
    }
}