
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor extends Thread { // herdar a classe thread - realizar multiplas conexões
    
    private Socket socket;
    
    public Servidor(Socket conexao) {
        this.socket = conexao;
    } // construtor
    
    @Override
    public void run() { // objeto que vai ser inicializado executa o metodo
        
        try {
            DataInputStream entrada = 
                    new DataInputStream(socket.getInputStream()); // recebe do socket

            while(true){
                String frase = entrada.readUTF();
                System.out.println(frase);

                if(frase.equals("sair")){
                    break;
                }

            }


            socket.close(); // fecha conexão

            
        } catch(Exception e) {
            
        }
        
    }
    
    public static void main(String[] args) {
        
        try {
        
            ServerSocket server = new ServerSocket(50000); //variavel do main


            while(true) { //laço infinito
                
                Socket conexao = server.accept(); // aguarda algum cliente solicitar conexão
                Servidor sThread = new Servidor(conexao); //socket instancia um servidor
                System.out.println("Algum cliente se conectou...");
                sThread.start(); //objeto vai ser inicializado
                
            }
        
        } catch(Exception e) {
            
        }
        
    }
    
}
