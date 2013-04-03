package TESTY;

import java.util.Scanner;

public class PODMINKY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");
        
        System.out.println("Zadej číslo, které odmocním: ");
        int a = Integer.parseInt(sc.nextLine());
        if (a>0)
        {
            System.out.println("Okej, takže umocníme na druhou.....");
            double x = Math.sqrt(a);
            System.out.println("Číslo " + a + "je na druhou: " + x);
        }
        else
        {
            System.out.println("Číslo je menší jak nula kryple.");
        }
        System.out.println("Děkujeme že jset využil tuhle kravinu. Nashledanou x)");
    }
    
}
