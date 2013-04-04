package TESTY;

import java.util.Scanner;
import java.util.Arrays;

public class PRACE_S_TEXTEM {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in, "UTF-8");
        
        String s;
        System.out.println("zadej větu ke spočítání samohlásek, souhlásek a nepísmenných znaků: ");
        s = sc.nextLine();
        s = s.toLowerCase();
        
        int pocetSamohlasek = 0;
        int pocetSouhlasek = 0;
        int pocet = 0;
        
        String samohlasky = "aeiouyáéěíóúůý";
        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";
        
        for (char c : s.toCharArray())
        {
            if (samohlasky.contains(String.valueOf(c)))
                pocetSamohlasek++;
            else
            if (souhlasky.contains(String.valueOf(c)))
                pocetSouhlasek++;
        }
        
        
        System.out.printf("Pocet samohlasek je: %d\n",pocetSamohlasek);
        System.out.printf("Pocet souhlasek je: %d\n",pocetSouhlasek);
        System.out.printf("Pocet nepísmenných znaků je: %d\n",s.length() - (pocetSouhlasek + pocetSamohlasek));
        
        
        /*********************************************************************************************************/
        
        String x = "cernediryjsoutamkdebuhdelilnulou";
        System.out.println("String k šifrování je: " + x);
        String sifrovana = "";
        int posun = 1;
        
        for (char v : x.toCharArray())
        {
            int i = (int)v;
            i +=posun;
            if (i>(int)'z')
                i -=26;
            sifrovana += (char)i;
            
        }
        
        System.out.println("Šifrovaná věta: " + sifrovana);
        
        
        /**********************************************************************************************************/
        
        String y = "dfsofejszktpvubnlefcviefmjmovmpv";
        System.out.println("String k dešifrování je: " + y);
        String desifrovana = "";
        
        for (char v : y.toCharArray())
        {
            int i = (int)v;
            i -=posun;
            if (i>(int)'z')
                i -=26;
            desifrovana += (char)i;
            
        }
        
        System.out.println("Dešifrovaná věta: " + desifrovana);
        
        /***********************************************************************************************************/
        
        // řetězec, který chceme dekódovat
        String r = ".. ... .-.. .- -. -.. ... --- ..-. -";
        System.out.printf("Původní zpráva: %s\n", r);
        
        // řetězec s dekódovanou zprávou
        String zprava = "";
        
        // vzorová pole
        String abecedniZnaky = "abcdefghijklmnopqrstuvwxyz";
        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
        "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
        "...-", ".--", "-..-", "-.--", "--.."};
        
        // rozbití řetězce na znaky morzeovky
        String[] znaky = r.split(" ");
        
        // iterace znaků morzeovky
        for (String morseuvZnak : znaky)
        {
            char abecedniZnak = '?';
            
            int index = -1;
            for (int i = 0; i < morseovyZnaky.length; i++)
            {
                if (morseovyZnaky[i].equals(morseuvZnak))
                    index = i;
            }
            
            if (index >= 0) // znak nalezen
            abecedniZnak = abecedniZnaky.charAt(index);
            zprava += abecedniZnak;
        }
        
        System.out.printf("Dekódovaná zpráva: %s\n", zprava);
        
        
        
    }
    
}
