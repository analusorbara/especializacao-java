
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    
    private static Socket socket;
    private static ServerSocket server;
    
    private static ObjectInputStream entrada;
    private static DataOutputStream saida;
    
    public static void main(String[] args) {
   
        try {
            
            server = new ServerSocket(50000);
            
            socket = server.accept();
            
            entrada = new ObjectInputStream(socket.getInputStream());
            saida = new DataOutputStream(socket.getOutputStream());

            
            Pessoa p = (Pessoa) entrada.readObject(); 
            
            System.out.println("Nome: " + p.getNome() + " Idade: " + p.getIdade());

            saida.writeBoolean(true);
            
            //socket.close();
            
        } catch(Exception e) {
            
        }
        
    }
    
}
