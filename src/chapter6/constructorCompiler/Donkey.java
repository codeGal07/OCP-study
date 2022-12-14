package chapter6.constructorCompiler;

//public class Donkey {
//}

//public class Donkey {
//    public Donkey() {
//    }
//}
//
//public class Donkey {
//    public Donkey() {
//        super();
//    }
//}
//
// * Java will automatically convert them all to the last definition
// (inserts default constructor and super())


//public class Mammal {
//    public Mammal(int age) {}
//}
//public class Seal extends Mammal {} // DOES NOT COMPILE
//
//public class Elephant extends Mammal {
//    public Elephant() {} // DOES NOT COMPILE
//}

// * Since Mammal defines a constructor, the
// * compiler does not insert a no-argument constructor.

//public class Seal extends Mammal {
//    public Seal() {
//        super(6); // Explicit call to parent constructor, to bi pa šlo
//    }
//}