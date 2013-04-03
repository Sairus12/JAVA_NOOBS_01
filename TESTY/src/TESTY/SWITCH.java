package TESTY;

import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "UTF-8");
        int volba,x,y;
        double vysledek,vysledek1;        
        String opravdu;
        
        System.out.println("Vítejte v mé jednoduché kalkulačce.");
        System.out.println("Opravdu chcete začít počítat? (ano/ne)");
        opravdu = sc.nextLine();
        opravdu = opravdu.toLowerCase();
        
        if (opravdu.equals("ano"))
        {
            System.out.println("Dobrá tedy.");
            System.out.println("Zadej první číslo: ");
            x = Integer.parseInt(sc.nextLine());
            System.out.println("Zadej druhé číslo: ");
            y = Integer.parseInt(sc.nextLine());

            System.out.println("==========================");
            System.out.println("Vyber jednu z možností.");
            System.out.println("1 - sčítání");
            System.out.println("2 - odčítání");
            System.out.println("3 - násobení");
            System.out.println("4 - dělení");
            System.out.println("5 - nadruhou");
            System.out.println("6 - odmocnina");
            volba = Integer.parseInt(sc.nextLine());
            
            while ((volba<=0) || (volba>=7))
            {
                System.out.println("==========================");
                System.out.println("Ty idiote!!! ");
                System.out.println("Vyber jednu z možností.");
                System.out.println("1 - sčítání");
                System.out.println("2 - odčítání");
                System.out.println("3 - násobení");
                System.out.println("4 - dělení");
                System.out.println("5 - nadruhou");
                System.out.println("6 - odmocnina");
                volba = Integer.parseInt(sc.nextLine());
            }
            
            switch (volba)
            {
                case 1 :
                {
                    vysledek = x + y;
                    System.out.println("Výsledek sčítání čísel x=" + x + " a y=" + y + " je: " + vysledek);
                    break;
                }
                case 2 :
                {
                    vysledek = x - y;
                    System.out.println("Výsledek odčítání čísel x=" + x + " a y=" + y + " je: " + vysledek);
                    break;
                }
                case 3 :
                {
                    vysledek = x * y;
                    System.out.println("Výsledek násobení čísel x=" + x + " a y=" + y + " je: " + vysledek);
                    break;
                }
                case 4 :
                {
                    vysledek = x / y;
                    System.out.println("Výsledek dělení čísel x=" + x + " a y=" + y + " je: " + vysledek);
                    break;
                }
                case 5 :
                {
                    vysledek = x * x;
                    vysledek1 = y * y;
                    System.out.println("Výsledek umocňování čísel x=" + x + " a y=" + y + " je: " + vysledek + " a " + vysledek1);
                    break;
                }
                case 6 :
                {
                    vysledek = Math.sqrt(x);
                    vysledek1 = Math.sqrt(y);
                    System.out.println("Výsledek odmocňování čísel x=" + x + " a y=" + y + " je: " + vysledek + " a " + vysledek1);
                    break;
                }
            }
        }
        else
        {
            System.out.println("Jo tak ty nechceš použít mojí kalkulačku? No řekl sis o to sám ;) Formátování disku .....");
        }
    }
    
}
