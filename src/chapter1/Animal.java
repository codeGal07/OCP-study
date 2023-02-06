package chapter1;


class Animal {
    int instanceVariable;

    public Animal(int constuctorParameter) {
        System.out.println(constuctorParameter);
    }



    public static void main(String... arg) {
//        var initialized_null = null; // error
//
//        var name = "Jack";
//        name = null; // ok
//
//        var num = 4;
//        num = null; // error
//

        final var neki = 4;


        int aa = -1______23 +1_2;
        String lala = """
                dsa""";
//
//        System.out.println(name, num, initialized_null);
        int localVariable;
        Animal animal = new Animal(3);
        System.out.print(animal.instanceVariable); // 0
//        System.out.println(localVariable); // error

        System.out.println("-----------");
        System.out.println("-----------");
        for (int i = 0, j = 5; i < j; i++, j--) {
            System.out.println(i);
        }
    }
}



