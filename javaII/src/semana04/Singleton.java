package semana04;

public final class Singleton {
    private static Singleton instance;
    private String algumValor;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getAlgumValor() {
        return algumValor;
    }

    public void setAlgumValor(String algumValor) {
        this.algumValor = algumValor;
    }
}