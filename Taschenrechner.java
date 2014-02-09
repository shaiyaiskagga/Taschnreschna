import java.util.Scanner;
class Taschenrechner {

    public static void main(String[] args) {
        float ezahl, zzahl, endz;
        String zeichen, add, sub, mul, div = new String();
        int zehn = 0;
        Scanner bucky = new Scanner(System.in);
        Scanner bony = new Scanner(System.in);
        System.out.println("Erste Zahl: ");
        ezahl = bucky.nextFloat();
        System.out.println("add, sub, mul, div ?");
        zeichen = bony.next();
        System.out.println("Zweite Zahl: ");
        zzahl = bucky.nextFloat();
        switch (zeichen) {
            case "add":
                endz = ezahl + zzahl;
                System.out.println(endz);
                break;
            case "sub":
                endz = ezahl - zzahl;
                System.out.println(endz);
                break;
            case "mul":
                endz = ezahl * zzahl;
                System.out.println(endz);
                break;
            case "div":
                endz = ezahl / zzahl;
                System.out.println(endz);
                break;
            default : endz = 0;
                break;
        }
        while (zehn <= 10){
            System.out.println(endz);
            zehn++ ;
        }

    }
}
