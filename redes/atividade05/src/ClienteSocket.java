import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteSocket {
    private final String urlServidor;
    private final int porta;
    byte[] buf = new byte[1000];
    DatagramPacket dp = new DatagramPacket(buf, buf.length);

    public ClienteSocket(String urlServidor, int porta) {
        this.urlServidor = urlServidor;
        this.porta = porta;
    }

    public String receberDoServidor() {
        try {
            DatagramSocket socket = new DatagramSocket();

            DatagramPacket out = new DatagramPacket(buf, buf.length, InetAddress.getByName(urlServidor), porta);
            socket.send(out);

            socket.receive(dp);
            socket.close();

            return new String(dp.getData());
        } catch (Exception e) {
            return e.toString();
        }
    }
}
