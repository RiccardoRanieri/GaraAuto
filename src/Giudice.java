import java.util.List;

public class Giudice extends Thread {

    public String classifica = "";
    int posizipone = 0;


    public Giudice() {
    }

    public void aggiorna() {

    }

    public void vedi() {

    }

    public synchronized void traguardo(String nome) {
        System.out.println("è arriavata al traguardo " + nome);

    }

}
