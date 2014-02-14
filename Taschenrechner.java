import java.util.Scanner;
class Taschenrechner{
    public static void main(String[]args){
        double zzahl, endz ;
        int n;
        String operation = new String ();
        String plus, minus, mal, geteilt, wurzel, log, ezahl = new String ();
        Scanner bony = new Scanner (System.in);
        System.out.println("plus minus mal geteilt wurzel hoch log ?");
        operation = bony.next();
        if (new String (operation).equals("wurzel")){
            System.out.println("Zahl: ");
            ezahl = bony.next();
            if ( ezahl.equals("e")){
                System.out.println("Wie vielte Wurzel?");
                n = bony.nextInt();
                potenz (n);
                radizieren (eul);
                end ();
            }else{
                double ezahll = Double.parseDouble(ezahl);
                System.out.println("Wie vielte Wurzel?");
                n = bony.nextInt();
                potenz (n);
                radizieren (ezahll);
                end ();
            }
        }else{
            switch (operation){
                case "plus":
                        System.out.println("Erste Zahl: ");
                        ezahl = bony.next();
                        if (ezahl.equals("e")){
                            setE ();
                            getE ();
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = eul + zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                        }else{
                            double ezahll = Double.parseDouble (ezahl);
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = ezahll + zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                            }
                    break;
                case "minus": 
                        System.out.println("Erste Zahl: ");
                        ezahl = bony.next();
                        if (ezahl.equals("e")){
                            setE ();
                            getE ();
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = eul - zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                        }else{
                            double ezahll = Double.parseDouble (ezahl);
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = ezahll - zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                            }
                    break;
                case "mal": 
                        ezahl = bony.next();
                        if (ezahl.equals("e")){
                            setE ();
                            getE ();
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = eul * zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                        }else{
                            double ezahll = Double.parseDouble (ezahl);
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = ezahll * zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                            }
                    break;
                case "geteilt": 
                        ezahl = bony.next();
                        if (ezahl.equals("e")){
                            setE ();
                            getE ();
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = eul / zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                        }else{
                            double ezahll = Double.parseDouble (ezahl);
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            endz = ezahll / zzahl ;
                            System.out.println("Das Ergebnis ist: " + endz);
                            }
                    break;
                case "hoch":
                        System.out.println("Erste Zahl: ");
                        ezahl = bony.next();
                        if ( ezahl.equals("e")){
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            Basis (eul) ;
                            Exponent (zzahl) ;
                            Math () ;
                            endP () ;
                            Give () ;
                        }else{
                            System.out.println("Zweite Zahl: ");
                            zzahl = bony.nextDouble();
                            double ezahll = Double.parseDouble(ezahl);
                            Basis (ezahll) ;
                            Exponent (zzahl) ;
                            Math () ;
                            endP () ;
                            Give () ;
                        }
                    break;
                case "log":
                        System.out.println("Logarithmus: ");
                        ezahl = bony.next();
                        if ( ezahl.equals("e")){
                            System.out.println("zur Basis: ");
                            zzahl = bony.nextDouble();
                            set1 (eul) ;
                            set2 (zzahl) ;
                            ergebnis () ;
                            endL () ;
                        }else{
                            System.out.println("zur Basis: ");
                            zzahl = bony.nextDouble();
                            double ezahll = Double.parseDouble(ezahl);
                            set1 (ezahll) ;
                            set2 (zzahl) ;
                            ergebnis () ;
                            endL () ;
                        }
                    break;
                default:
                    break;
        }
        }
    }                                                                           //Euler
    public static String e = new String ("0.0"); 
    public static double eul ;
    private static double total = 0;
    public static double average ;
    public static void setE(){
        double ez = Double.parseDouble (e);
        double expo = 1.0 ;
        for (int counter = 1 ; counter < 100000 ; counter++){
            ez = Math.pow((1.0 + 1.0 / expo ), expo ) ;
            total = total + ez ;
            expo = expo + 1.0;
        }
        eul = total / 100000 ;
        String e = String.valueOf(ez);
    }
    public static double getE(){
        return eul ;                                                        
    }
    private static int x;                                                                                   //Wurzel
    static double a;
    public static void potenz (int p){
        x = p;
    }
    public static void radizieren (double ezahl){
        double b = 1.0;
        a = ezahl ;
        for (int i = 1; i <= 20; i++){
            b = (a + (x - 1) * b) / x ;
            a = ezahl / (Math.pow(b, (x - 1))) ;
        }
    }
    public static double set (){
        return a;
    }
    public static void end (){
        System.out.println("Das Ergebnis ist: " + a);
    }
    static double ap, bp, cp ;                                                            //Potenz
    public static void Basis (double u){
        ap = u ;
    }
    public static void Exponent (double v){
        bp = v ;
    }
    public static void Math (){
        cp = Math.pow(ap, bp); 
    }
    public static double endP (){
        return cp ;
    }
    public static void Give (){
        System.out.println("Das Ergebnis ist: " + cp) ;
    }
    static double al, bl, cl ;                                                            //Logarithmus
    public static void set1(double m){
        al = m ;
    }
    public static void set2(double n){
        bl = n ;
    }
    public static double ergebnis(){
        cl = ( Math.log10(al) ) / ( Math.log10(bl)) ;
        return cl ;
    }
    public static void endL(){
        System.out.println("Das Ergebnis ist: " + cl);
    }
}