package chapter6.callingSuperReference;

public class Crocodile extends Reptile{
    protected int speed = 20;

    public int getSpeed(int speed) {
        return this.speed;
    }

    public static void main(String[] data) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed(5)); // 20
    }
}
