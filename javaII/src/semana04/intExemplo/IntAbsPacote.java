package semana04.intExemplo;// importações do pacote animal

public class IntAbsPacote {
    public static void main(String[] args) {
        Gato gato = new Gato1Impl();

        // imprime o nome do gato 1
        System.out.println(gato.nome());
        // possui o método da classe abstrata animal.Animal
        System.out.println(gato.tipo());

        // imprime o nome do gato 2
        // utilizando a mesma variável, ou seja
        // a mesma assinatura de interface
        gato = new Gato2Impl();
        System.out.println(gato.nome());
        // possui o método da classe abstrata animal.Animal também
        System.out.println(gato.tipo());

        // erro, uma classe abstrata não pode ser instanciada
//        Animal animal = new Animal();
    }
}
