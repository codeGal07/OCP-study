package chapter4;

public class SwitchStatement {
    public static void main(String[] args) {
        int month = 5;
        switch (month) {
            // that is the bitwise result of 1 | 2, which is 3 (01 or 10 = 11)
            case 1 | 2: System.out.print("January");
        }
        switch (month) {} // DOES COMPILE

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("multiple case"); // DOES COMPILE
                break;
        }

        boolean booleanVariable = true;
//        boolean, long, float, double, and each of their associated wrapper classes
//        are not supported by switch statements.

//        switch (booleanVariable) {
//            case true:
//                System.out.println("boolean case"); // DOES NOT COMPILE
//                break;
//        }

        int dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday"); // no break, so switch statement doesn't stop
            case 6:
                System.out.println("Saturday");
                break;
        }
        // Weekday
        // Saturday


//        Even though the default block was before the case block, only the case block was
//        executed. If you recall the definition of the default block, it is branched to only if there
//        is no matching case value for the switch statement, regardless of its position within the
//        switch statement.
        dayOfWeek = 6;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday"); // no break, so switch statement doesn't stop
            case 6:
                System.out.println("Saturday");
                break;
        }
        // Saturday

    }
    final int getCookies() { return 4; }
    private int myFunction (final int integerParameter){
        int id = 1;
        final int finalInt = 5;
        final int functionCall = getCookies();

        switch (integerParameter) {
//            case getCookies(): Does not compile because it is function
//                id = 4;
//            case functionCall: Does not compile because it calls function
//                id=5;
            case finalInt:
                id =3;
        }
        return id;

    }

}
