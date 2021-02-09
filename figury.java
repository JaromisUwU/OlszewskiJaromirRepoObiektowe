import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class figury{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("podaj figure");
    String figura = scan.nextLine(); 
    if(figura.equals("prostakat")){

     
    System.out.println("podaj szerokosc");
    int szer = scan.nextInt();
     
    System.out.println("podaj wysokosc");
    int wys = scan.nextInt(); 
    for(int i = 0; i < szer; i++){
      for(int j = 0; j < wys; j++){
      System.out.print("*");
      }
      System.out.println(); 
    } 
    System.out.println("pole = "+wys * szer); 
    System.out.println("objetosc = "+(wys * 2  + szer * 2));
    }
      if(figura.equals("kwadrat")){
        System.out.println("podaj bok");
        int szer = scan.nextInt();
        for(int i = 0; i < szer; i++){
          for(int j = 0; j < szer; j++){
            System.out.print("*");
      }
      System.out.println();
      }
      System.out.println("pole = "+szer * szer); 
      System.out.println("objetosc = "+(szer * 4));
    } 
  }
}