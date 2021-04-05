package generics;

public class TesteDoisParametros <T,S> {
    private final T varT;
    private final S varS;

    public TesteDoisParametros(T varT, S varS) {
        this.varT = varT;
        this.varS = varS;
    }

    public void print() {
        System.out.println(varT);
        System.out.println(varS);
    }

    public <S> S meuGenerico(S valor) {
        return valor;
    }
}
