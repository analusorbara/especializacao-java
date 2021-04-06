
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

//classe principal para gerar multiplos clientes

public class Cliente {

   public static void gerarCliente(){

        Socket socket; //canal de comunicação com o servidor

        DataInputStream entrada; //canal de envio e recebimento de dados
        DataOutputStream saida;

        try {

            socket = new Socket("127.0.0.1", 50000); // instanciação do objeto

            entrada = new DataInputStream(socket.getInputStream()); // instaciar fluxo de entrada
            saida = new DataOutputStream(socket.getOutputStream()); // saida

            while(true){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // leitor de teclado
                System.out.print("Digite uma frase: ");
                String frase = br.readLine();//variavel string recebendo do teclado

                if(frase.equals("sair")){
                    break;
                }

                saida.writeUTF(frase); //enviar a frase ao servidor


            }


            socket.close(); // fecha conexão


        } catch(Exception e) {

        }

    }
    
}
