package innerClass;

public class InnerClassTests {
    public static void main(String[] args) {
        // cria o objeto externo computador
        Computador computador = new Computador();

        // cria objetos a partir de uma classe interna
        Computador.Processador processador = computador.new Processador();
        Computador.Ram ram = computador.new Ram();

        // mostra os valores
        System.out.println("Processador Cache = " + processador.getCache());
        System.out.println("Ram tamanho = " + ram.getMemoria());
    }
}
