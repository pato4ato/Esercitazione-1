public class GestoreGioco {
    private int numeroVincente;

    public GestoreGioco() {
        numeroVincente = 5;
    }

  public void verifica(int num){
      if(num==numeroVincente)
          System.out.println("Hai vinto! :D");
      else
System.out.println("Hai perso! :o");
  }
}