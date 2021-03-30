class Logowanie{
    private String login = "";
    private String haslo = "";
   public Logowanie(String login, String hasło){
        this.login = login; 
        this.haslo = haslo;
     
        
        public void siema(){
    return ("witaj"+login+" \n "+hasło+" ");
                    }
         @Override
        public String toString(){
            return hasło +"\n "+login;
   }