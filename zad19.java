import java.util.*;
import java.util.Arrays;
import java.util.Random;
class zad19 {
 	public static void main(String args[]){
		Random r = new Random();
int r1=r.nextInt();
int r2=r.nextInt();
int r3=r.nextInt();
int r4=r.nextInt();
int r5=r.nextInt();
int r6=r.nextInt();
int r7=r.nextInt();
int r8=r.nextInt();
int r9=r.nextInt();
int r10=r.nextInt();
int table[][]={ {r1,r2,r3,r4,r5},{r6,r7,r8,r9,r10}
};
for (int i=0; i<table.length; i++)
{
    for(int j=0;j<table[i].length; j++)
    {
        System.out.print(table[i][j]+"  ");
    }
    System.out.println();    
}
 
 	}
 }