package prova;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("127.0.0.1", 1234);

            DataInputStream entrada = new DataInputStream(socket.getInputStream());

            int valor = 100;

            DataOutputStream saida = new DataOutputStream(socket.getOutputStream());

            saida.writeInt(valor);

            String resultado = entrada.readUTF();

            System.out.println(resultado);

            socket.close();

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

}