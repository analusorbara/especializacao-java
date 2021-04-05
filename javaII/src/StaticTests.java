public class StaticTests
{
    public static void main(String[] args) {
        // obtém uma referência da instância da classe
        Singleton singleton = Singleton.getInstance();
        // obtém a mesma referência anterior
        Singleton singleton2 = Singleton.getInstance();

        // coloca algum valor na primeira referência
        singleton.setAlgumValor("teste");

        // le o mesmo valor mas na mesma referência
        System.out.println(singleton2.getAlgumValor());
    }
}
