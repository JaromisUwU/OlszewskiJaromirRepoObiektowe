
class PierwszyKonstruktor{
    public static void main (String[] args){
        /*
        MojeBmi mb = new MojeBmi(190,86);
        mb.wzrost = 160;
        mb.waga = 80;
        */
        
        //Zmiana atrybutow obiektu poprzez konstruktor
        MojeBmi mb = new MojeBmi(190,86);
        ImieNazwisko im = new ImieNazwisko("Jaromir","Olszewski");
        System.out.println("Pola w obiekcie "+mb.wzrost+" "+mb.waga);
    }
}