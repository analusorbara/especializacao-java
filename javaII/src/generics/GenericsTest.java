package generics;

public class GenericsTest {
    public static void main(String[] args) {
        TesteDoisParametros<String, String> testeDoisParametros = new TesteDoisParametros<>("teste", "teste 2");
        testeDoisParametros.print();

        Contador contador = new Contador<>();

        TesteDoisParametros<Double,String> obj = new TesteDoisParametros<>(1.1, "Hi");
        TesteDoisParametros<?,?> obj2 = new TesteDoisParametros<>(1.1, "Hi");
    }
}
