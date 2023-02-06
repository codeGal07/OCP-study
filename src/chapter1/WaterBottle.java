package chapter1;

public class WaterBottle {


    public static float code;

    public WaterBottle() {
        this.empty = true;
        System.out.println(this.empty);
    }

    private String brand;
    private boolean empty;


    int a = 1;

    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    void getFish(Object fish) {
         if (!(fish instanceof String guppy))
             System.out.print("Eat!");
         else if (!(fish instanceof String gupgpy)) {
             throw new RuntimeException();
             }
         System.out.print("Swim!");
         }

    int b = 2;

    void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.print(data);
    }
//    void printIntegersOrNumbersGreaterThan5(Number number) {
//        if(number instanceof Integer data || data.compareTo(5)>0)
//            System.out.print(data);
//    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
        System.out.print("dsaadads");
    }

    void mojafunkcija(int i) {
        if (i == 1) {
            return;
        }
        System.out.println("moj i = 1");


        if (i == 2) {
            return;
        }
        System.out.println("moj i = 2");
    }

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        float mojfloat = 6.5f;
        int _dsa = 3;
        short mojshort = (short) 1921222;
        var var = new Object();
        var = "fds";
        int binarno = 5;


        boolean mojtrue = true;
        boolean monkey = mojtrue == false;
        System.out.println("monkey: " + monkey);

        byte ena = 1;
        byte dva = 2;
        byte tri = 1 + 2;
        byte not_overflow = 7 * 10;
//        byte overflow = 7*100;
//        byte tri_variable = ena+dva;
//        System.out.print(null instanceof null); // DOES NOT COMPILE


        long reptile = 2147483647;
        short tail = (4 + 10);
        System.out.println(mojshort);
        System.out.println(tail);
        System.out.println(~binarno);
        System.out.println(var);
        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand = " + wb.brand);
        System.out.println("Code = " + code);
        System.out.println(mojfloat);

        wb.instanceMethod();

        System.out.println("---------------------------");
//        wb.printOnlyIntegers(423);

        wb.mojafunkcija(2);

        String[] sloths = new String[3];
        sloths[0] = "a";
        sloths[1] = "b";
        sloths[2] = "c";
        for (String sloth : sloths) // DOES NOT COMPILE
            System.out.print(sloth + " ");


        int i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;
                continue;
            }
            int b = 3;
            int krneki = 4;
            int ss = b + krneki;
            System.out.println(i++);
        }


        i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;
                break;
            }
            int b = 3;
            int krneki = 4;
            int ss = b + krneki;
            System.out.println(i++);
        }

        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) {
                    yield "Blobfish";
                } else yield "Green";
            }
            default -> "Swordfish";
        };

        int temperature = 4;
        long humidity = -temperature + temperature * 3;
        if (temperature >= 4)
            if (humidity < 6)
                System.out.println("Too Low");
            else
                System.out.println("Just Right");
        else
            System.out.println("Too High");

        int count = 0;
        BUNNY:
        for (int row = 1; row <= 3; row++)
            RABBIT:for (int col = 0; col < 3; col++) {
                if ((col + row) % 2 == 0)
                    continue BUNNY;
                count++;
            }
        System.out.println(count);


        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B':
            case 'C':
                System.out.print("great ");
            case 'D':
                System.out.print("good ");
            case e:
            case 'F':
                System.out.print("not good ");
        }

        System.out.println("-----");
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;
        switch (instrument) {
            case "bass":
                break;
            case CELLO:
                p++;
            default:
                p++;
            case "VIOLIN":
                p++;
            case "viola":
                ++p;
                System.out.println("ewawsdeasd");
                break;
        }
        System.out.print(p);




        int height = 1;
        L1:
        while (height++ < 10) {
            long humidityy = 12;
            L2:
            do {
                int lala = 4;
                continue L1;
//                 if(humidityy-- % 12 == 0)
//                     continue L2 ;
//                 int temperaturee = 3;
//                 L3: for( ; ; ) {
//                     temperaturee++;
//                     if(temperaturee>5)
//                         continue L2 ;
//                     }
            } while (humidityy > 4);
        }



        wb.getFish("goldie");

    }
}