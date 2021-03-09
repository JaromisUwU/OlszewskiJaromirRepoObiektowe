class Rekurencja2{
    public static void main(String[] args){
        int liczba = sumaKolejnychLiczb(3);
        System.out.println("Wynik: "+liczba);
        liczba = obliczanieSilni(9999999999999);
        System.out.println("Silnia: "+liczba);
    }

    private static int sumaKolejnychLiczb(int liczba){
        if(liczba>0) return liczba+sumaKolejnychLiczb(liczba-1);
        return 0;
    }

    private static int obliczanieSilni(int liczba){
        if(liczba>1) return liczba*obliczanieSilni(liczba-1);
        return 1;
    }
    private static String wyswietlanieWyrazu(String wyraz){
        //wprowadzamy:Anna
        //Wynik:
        //Anna
        //Ann
        //An
        //a
        if(wyraz.lenght() > 0){
            return wyraz + "\n" +wyświetlanieWyrazu(wyraz.substring(0,wyraz.lenght()-1));
          
        }
    }
}