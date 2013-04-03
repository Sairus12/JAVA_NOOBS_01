package TESTY;

import java.util.Scanner;
import java.util.Arrays;

public class POLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
                
        int a;
        int[] x;
        System.out.println("Zadej číslo, po které se budou vypisovat čísla: ");
        a = Integer.parseInt(sc.nextLine());
        x = new int[a];
        for (int i = 0;i<a;i++)
        {
            x[i] = i+1;
        }
        for (int i:x)
        {
            System.out.println(i);
        }
        
        /******************************************************************************************/
        
        String[] simpsonovi = {"Meggie","Marge","Homer","Lisa","Bart"};
        Arrays.sort(simpsonovi);
        for (String i : simpsonovi)
            System.out.printf("%s ",i);

        /******************************************************************************************/

        int[] cisla = {1,5,6,8,2,4};
        Arrays.sort(cisla);
        for (int i : cisla)
            System.out.printf("%d ",i);
        
        /******************************************************************************************/

        String[] simpsonovi = {"Meggie","Marge","Homer","Lisa","Bart"};
        System.out.println("Zadej jméno Simpsona (z rodiny Simpsonů): ");
        String simpson = sc.nextLine();
        
        Arrays.sort(simpsonovi);
        int pozice = Arrays.binarySearch(simpsonovi, simpson);
        if (pozice >= 0)
        {   System.out.println("Ano, je to Simpson!");  }
        else
        {   System.out.println("Ty kryple, nepoznáš Simpsonovi?!"); }

        /******************************************************************************************/
        
        System.out.println("Vítej v programu ke spočítání neváženého průměru známek.");
        System.out.println("Zadej počet známek: ");
        int pocet = Integer.parseInt(sc.nextLine());
        int[] znamky = new int[pocet];
        for (int i = 0; i < pocet; i++)
        {
            System.out.printf("Zadej %d. známku: ",i + 1);
            znamky[i] = Integer.parseInt(sc.nextLine());
        }
        int soucet = 0;
        for (int i : znamky)
            soucet += i;
        float vysledek = soucet / (float)znamky.length;
        
        System.out.printf("Nevážený průměr známek je: %f\n", vysledek);
        
        
    }
}
