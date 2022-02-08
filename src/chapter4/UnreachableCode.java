package chapter4;

public class UnreachableCode {
    public static void main(String [] args) {

        // code placed immediately after break, continue and return
        // is considered unreachable and will not compile
        int checkDate = 0;
        while(checkDate<10) {
            checkDate++;
            if(checkDate>100) {
                break;
                //checkDate++; // DOES NOT COMPILE
            }
        }

    }

}
