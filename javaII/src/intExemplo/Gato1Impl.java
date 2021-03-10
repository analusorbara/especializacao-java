package intExemplo;

public class Gato1Impl extends AnimalImpl implements Gato {
    @Override
    public String nome() {
        return "tito";
    }

    @Override
    public int idade() {
        return 7;
    }
}
