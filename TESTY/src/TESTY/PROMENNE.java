package TESTY;

import java.util.Scanner;

public class PROMENNE {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in,"UTF-8");
        
        /* String x = "Krokonosohroch";
        System.out.println(x.startsWith("krok"));
        System.out.println(x.endsWith("hroch"));
        System.out.println(x.contains("nos"));
        System.out.println(x.contains("hrok"));
        
        String config = "Fullscreen shaDows autosave";
        config = config.toLowerCase();
        System.out.println("Poběží hra ve fullscreenu?");
        System.out.println(config.contains("fullscreen"));
        System.out.println("Budou zapnuté stíny?");
        System.out.println(config.contains("shadows"));
        System.out.println("Přeje si hráč vypnout zvuk?");
        System.out.println(config.contains("nosound"));
        System.out.println("Přeje si hráč hru automaticky ukládat?");
        System.out.println(config.contains("autosave")); */
        
        /* System.out.println("Zadej číslo: ");
        String s = sc.nextLine();
        System.out.println("Zadali jste text: " + s);
        System.out.println("Text po funkci trim: " + s.trim());
        int a = Integer.parseInt(s.trim());
        System.out.println("Převedl jsem zadaný text na číslo parsováním, zadal jste: " + a); */
          
        /* String s = "C# je nejlepší";
        System.out.println(s);
        s = s.replace("C#","Java");
        System.out.println(s);
        
        int a = 10;
        int b = 20;
        int c = a + b;
        String x = String.format("Když sečteme %d a %d dostaneme %d",a,b,c);
        System.out.println(x);
        System.out.printf("Když sečteme %d a %d dostaneme %d\n",a,b,c); */
        
        System.out.println("Zadejte vaše jméno:");
        String jmeno = sc.nextLine();
        System.out.printf("Délka vašeho jména je: %d", jmeno.length());
        
    }   
}