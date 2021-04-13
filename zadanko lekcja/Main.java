class main{
    public static void main(String[] args){
        osoba o1 = new osoba(177, 80);
        System.out.println(o1);
        osoba o2 = new osoba("Jaromir", "Olszewski");
        System.out.println(o2);
        osoba o3 = new osoba(199, 90, "Jaromir", "Olszewski");
        System.out.println(o3);
    }
}