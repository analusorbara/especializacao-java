package intExemplo;

public class Gato2Impl extends AnimalImpl implements Gato {
    @Override
    public String nome() {
        return "fifo";
    }

    @Override
    public int idade() {
        return 4;
    }
}
