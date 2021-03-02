public class tabdwowym{
    public static void main (String[] args){
        tablica();
    
    
        int[][] tab = new int [2][2];
        tab[0][0] = 1;
        tab[0][1] = 2;
        tab[1][1] = 3;
        tab[1][2] = 4;

        for (int i = 0; i<tab.lenght; i++){
            for(int j=0;j<tab[i].lenght;j++){
                System.out.println(tab[i][j]);
            }
        }
    }
}
}