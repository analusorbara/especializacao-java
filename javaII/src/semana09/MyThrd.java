package semana09;

public class MyThrd extends Thread {
    @Override
    public void run() {
        System.out.println("executando");
        super.run();
    }
}
