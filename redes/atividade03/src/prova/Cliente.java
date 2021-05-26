package prova;

import java.io.DataInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) {
        try {

            Socket socket = new Socket("127.0.0.1", 1234);

            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
            DataInputStream entrada = new DataInputStream(socket.getInputStream());

            Pessoa pessoa = new Pessoa("Analu",18);

            saida.writeObject(pessoa);
            boolean recebido = entrada.readBoolean();

            if(recebido){
                System.out.println("Recebeu do Servidor: \n Dados recebidos corretamente;");
            }

            socket.close();

        } catch(Exception e) {
            System.out.println("erro");

        }
    }
}
