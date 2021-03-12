import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ServidorSocket extends Thread { // herdar a classe thread - realizar multiplas conexões
    private final DatagramSocket socket;
    private final List<String> piadas;
    private int index = 0;
    private final byte[] buf = new byte[256];

    public ServidorSocket(DatagramSocket conexao, List<String> piadas) {
        this.socket = conexao;
        this.piadas = piadas;
    } // construtor

    @Override
    public void run() { // objeto que vai ser inicializado executa o metodo
        try {
            while (true) {
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);

                InetAddress address = packet.getAddress();
                int port = packet.getPort();

                if (index == piadas.size()) {
                    byte[] vazio = "Sem mais piadas para enviar".getBytes(StandardCharsets.UTF_8);
                    packet = new DatagramPacket(vazio, vazio.length, address, port);
                    socket.send(packet);
                } else {
                    byte[] piada = piadas.get(index).getBytes(StandardCharsets.UTF_8);
                    packet = new DatagramPacket(piada, piada.length, address, port);
                    socket.send(packet);
                    index++;
                }
            }
        } catch (Exception e) {
            mostrarErro(e);
        }
    }

    private static void mostrarErro(Exception e) {
        System.out.println("Algo deu errado...");
        System.out.println(e.toString());
    }
}