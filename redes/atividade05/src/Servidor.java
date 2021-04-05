import java.io.File;
import java.net.DatagramSocket;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Servidor {
    public static void main(String[] args) {
        try {
            DatagramSocket server = new DatagramSocket(50000); //variavel do main
            String filePath = Paths.get("").toAbsolutePath().toString() + "/piadas.txt";
            List<String> piadas = readFile(filePath);

            ServidorSocket sThread = new ServidorSocket(server, piadas); //socket instancia um servidor
            System.out.println("Servidor iniciado!");
            sThread.start(); //objeto vai ser inicializado
        } catch (Exception e) {
            mostrarErro(e);
        }
    }

    private static List<String> readFile(String pathName) throws Exception {
        try {
            return Files.readAllLines(new File(pathName).toPath(), Charset.defaultCharset());
        } catch (Exception e) {
            mostrarErro(e);
            throw e;
        }
    }

    private static void mostrarErro(Exception e) {
        System.out.println("Algo deu errado...");
        System.out.println(e.toString());
    }
}