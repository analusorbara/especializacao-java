public class Cliente2 {
    public static void main(String[] args) {
        ClienteSocket clienteSocket = new ClienteSocket("127.0.0.1", 50000);
        System.out.println(clienteSocket.receberDoServidor());
    }
}
