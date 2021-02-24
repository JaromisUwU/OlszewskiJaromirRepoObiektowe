import java.util.*;
import java.util.Arrays;
import java.util.Random;
class zad19 {
 	public static void main(String[] args) {
         
        int[] tablica = new int[10];
    Random generator = new Random();

for(int i=0; i<36; i++) {

   tablica.add(generator.nextInt(6));
}
 		for (int i = 0; i < 10; i++)
 			tablica[i] = i + 1;
 		int a = tablica[3];
 		for (int i = 0; i < 10; i++)
 			System.out.println("Kolejna komorka to: " + tablica[i]);
 	}
 }