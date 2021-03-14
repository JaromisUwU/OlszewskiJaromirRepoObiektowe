package menu_switch;
import java.io.IOException;
import java.util.Scanner;
public class menu {
    public static int menu(){
        System.out.println();
        System.out.println("     ****************************************");
        System.out.println("     *           Super MENU  :)             *");
        System.out.println("     ****************************************");
        System.out.println("     1. cala baza");
        System.out.println("     2. Tylko 1 woj");
        System.out.println("     3. Jelen wszystkie woj");
        System.out.println("     0. Koniec");
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        return w;
    }
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int wybor = menu();
        while(wybor!=0){
            switch(wybor){
                case 1:
                System.out.println("Jednostka             jelenie                                         Sarny                                           dziki  \n");
                System.out.println("terytorialna\n");
                System.out.println("                     ilosc     wartosc      wartosc   wartosc        ilosc     ilosc        wartosc      wartosc      ilosc    ilosc     wartosc    wartosc \n");
                System.out.println("                     2009      2010         2009      2010           2009      2010         2009         2010         2009     2010      2009       2010 \n");
                System.out.println("t    \n");
                System.out.println("LODZKIE               36        50         2254         374           48         64         4104         673        12        17        306        68\n");
                System.out.println("MAZOWIECKIE           43        257        2603         22158         51         222        4809         26132      13        202       31         9942\n");
                System.out.println("MALOPOLSKIE           78        89         5132         6894          54         52         5189         535        9         13        344        628\n");
                System.out.println("SLASKIE               115       119        7602         8937          74         70         633          666        138       155       4121       5392\n");
                System.out.println("LUBELSKIE             31        54         197          4565          60         82         5592         9486       14        59        37         2479\n");
                System.out.println("PODKARPACKIE          262       187        16766        15094         127        104        12126        12756      39        48        1238       2084\n");
                System.out.println("PODLASKIE             86        130        5151         9388          36         50         3134         5333       18        76        462        4799\n");
                System.out.println("SWIETOKRZYSKIE        14        20         918          1443          16         16         1576         165        3         3         72         177\n");
                System.out.println("LUBUSKIE              233       224        14571        17175         135        108        12633        12034      196       254       5503       11966\n");
                System.out.println("WIELKOPOLSKIE         314       317        19526        23095         211        183        20361        19856      259       419       7039       17662\n");
                System.out.println("ZACHODNIOPOMORSKIE    562       657        35519        4753          251        243        23971        26632      597       970       16909      4364\n");
                System.out.println("DOLNOSLASKIE          286       275        1953         22537         223        207        20763        22068      243       352       7239       1553\n");
                System.out.println("OPOLSKIE              269       189        1848         1457          172        107        13472        9883       372       271       11159      10441\n");
                System.out.println("KUJAWSKO-POMORSKIE    149       196        917          1436          86         86         8388         9564       64        127       1577       5224\n");
                System.out.println("POMORSKIE             228       263        14033        18961         106        97         1018         1070       69        158       1654       6723\n");
                System.out.println("WARMINSKO-MAZURSKIE   310       393        18902        29731         170        218        16048        24764      255       519       7094       24186\n");
                    break;
                case 2:
                    System.out.println("LODZKIE               36        50         2254         374           48         64         4104         673        12        17        306        68\n");
                    break;
                case 3:
                     System.out.println("Jednostka             jelenie                               \n");
                System.out.println("terytorialna\n");
                System.out.println("                         wartosc      wartosc   \n");
                System.out.println("                          2010         2009       \n");
                System.out.println("t    \n");
                System.out.println("LODZKIE                     2254         374           \n");
                System.out.println("MAZOWIECKIE                 2603         22158         \n");
                System.out.println("MALOPOLSKIE                 5132         6894          \n");
                System.out.println("SLASKIE                     7602         8937          \n");
                System.out.println("LUBELSKIE                   197          4565          \n");
                System.out.println("PODKARPACKIE                16766        15094         \n");
                System.out.println("PODLASKIE                   5151         9388          \n");
                System.out.println("SWIETOKRZYSKIE              918          1443          \n");
                System.out.println("LUBUSKIE                    14571        17175         \n");
                System.out.println("WIELKOPOLSKIE               19526        23095         \n");
                System.out.println("ZACHODNIOPOMORSKIE          35519        4753          \n");
                System.out.println("DOLNOSLASKIE                1953         22537         \n");
                System.out.println("OPOLSKIE                    1848         1457          \n");
                System.out.println("KUJAWSKO-POMORSKIE          917          1436          \n");
                System.out.println("POMORSKIE                   14033        18961         \n");
                System.out.println("WARMINSKO-MAZURSKIE         18902        29731         \n");
            }
            System.out.println("\nWcisnij Enter, aby kontynuowac...");
            System.in.read();
 
            wybor = menu();
        }
        System.out.println("     ****************************************");
        System.out.println("\n     Koniec programu\n\n");
    }
}