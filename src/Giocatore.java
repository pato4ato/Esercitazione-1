import java.util.Scanner;

public class Giocatore extends Thread {
   int punteggio;
    String nome;
    int id;
    GestoreGioco gg;

    public Giocatore(String nome, GestoreGioco gestore) {
        this.nome = nome;
        this.gg = gestore;
        punteggio = 0;
    }

    public void comunica() {
        System.out.printf("Sono il giocatore %s !\n", nome);
    }


    public void gioca() {
        System.out.println(nome + ", inserisci un numero: ");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        System.out.println("Ho scelto il numero " + num);

        gg.verifica(num);
    }

    @Override
    public void run() {
        comunica();
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Errore nel thread del giocatore");
        }
        gioca();
    }
}
