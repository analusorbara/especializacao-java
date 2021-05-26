package prova;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private static Socket socket;
    private static ServerSocket server;

    private static DataInputStream entrada;
    private static DataOutputStream saida;

    public static void main(String[] args) throws IOException {

        try {
            //criar porta de recepção

            server = new ServerSocket(1234);
            socket = server.accept();

            //criar os fluxos de entrada e saida
            entrada = new DataInputStream(socket.getInputStream());
            saida = new DataOutputStream(socket.getOutputStream());

            //recebimento do valor inteiro

            int valor = entrada.readInt();

            //processamento do valor
            String resultado;

            if (valor%2==0)
                resultado = "par";
            else
                resultado = "impar";

            //envio dos dados (resultado)

            saida.writeUTF(resultado);

            socket.close();

        } catch (Exception e) {
        }

    }

}
