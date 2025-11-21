import java.util.Random;

public class Auto extends Thread{
    Giudice g;
    String nome;
    public Auto(Giudice g, String nome){
        this.nome = nome;
        this.g = g;
    }
    @Override
    public void run () {
        Random random = new Random();
        int attesa = random.nextInt(1,5);
        try {
            wait(attesa);
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        g.traguardo(nome);
    }
}
