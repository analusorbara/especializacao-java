package semana09;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThrd();

        t1.setPriority(Thread.NORM_PRIORITY + 3);

        t1.join();
    }
}
