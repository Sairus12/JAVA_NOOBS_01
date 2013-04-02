package TESTY;

import java.util.Scanner;

public class KALKULACKA {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("Ahoj světe.");
        System.out.println("Zadej číslo, které bude vypsáno na obrazovku: ");
        int x=Integer.parseInt(sc.nextLine());
        System.out.println(x);
        System.out.println("Vítejte v kalkulačce od dementa. x)");
        System.out.println("Zadej první číslo: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Zadej druhé čílso: ");
        int b = Integer.parseInt(sc.nextLine());
        float soucet = a + b;
        float rozdil = a - b;
        float soucin = a * b;
        float podil = a / b;
        System.out.println("Soucet čísel je: "+soucet);
        System.out.println("Rozdíl čísel je: "+rozdil);
        System.out.println("Součin čísel je: "+soucin);
        System.out.println("Podíl čísel je: "+podil);
        System.out.println("Děkujeme za využití dementní kalkulačky. Nashledanou x)");
        
        
    }
}
