import java.util.Random;
public class zaddom{
    public static void main (String[] args){
        Random rd = new Random(); 
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rd.nextInt(6); 
            System.out.println(tab[i]); 
        }
            System.out.println("\n");
        String[] tab1 = new String[10];
        tab1 [0]  = "Jan Mucha";
        tab1 [1]  = "Marcin Szef";
        tab1 [2]  = "Andrzej Banan";
        tab1 [3]  = "Marek Kloc";
        tab1 [4]  = "Bogus Halabarda";
        tab1 [5]  = "Damian Tasma";
        tab1 [6]  = "Jaromir Olszewski";
        tab1 [7]  = "Damian Deszcz";
        tab1 [8]  = "Jan Kremowa";
        tab1 [9]  = "Hubert Gnach";
            System.out.print(tab1[0]+" : "); 
            System.out.println(tab[0]); 
            System.out.print(tab1[1]+" : "); 
            System.out.println(tab[1]);
            System.out.print(tab1[2]+" : "); 
            System.out.println(tab[2]);
            System.out.print(tab1[3]+" : "); 
            System.out.println(tab[3]);
            System.out.print(tab1[4]+" : "); 
            System.out.println(tab[4]);
            System.out.print(tab1[5]+" : "); 
            System.out.println(tab[5]);
            System.out.print(tab1[6]+" : "); 
            System.out.println(tab[6]);
            System.out.print(tab1[7]+" : "); 
            System.out.println(tab[7]);
            System.out.print(tab1[8]+" : "); 
            System.out.println(tab[8]);
            System.out.print(tab1[9]+" : "); 
            System.out.println(tab[9]);
   }    
}