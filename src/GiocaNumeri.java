public class GiocaNumeri {
    public static void main(String[] args) {
        System.out.println("INIZIA");

        GestoreGioco gg = new GestoreGioco();

        Giocatore g1 = new Giocatore("Chask", gg);
        Giocatore g2 = new Giocatore("Ramsk", gg);

        g1.start();
        g2.start();

        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.err.println("Errore nell'attesa dei thread.");
        }

        System.out.println("FINE GIOCO!!!");
    }
}
