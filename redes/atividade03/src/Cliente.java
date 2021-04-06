
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
    
    private static Socket socket;
    
    private static ObjectOutputStream saida;
    private static DataInputStream entrada;
    private static JTextArea tf3;

    public static void janela(){
        JFrame f=new JFrame("");//creating instance of JFrame

        JLabel l1=new JLabel("Nome:");
        l1.setBounds(20,10, 100,30);
        JLabel l2=new JLabel("Idade:");
        l2.setBounds(20,70, 100,30);
        JLabel l3=new JLabel("Retorno do Servidor:");
        l3.setBounds(20,130, 200,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);

        JTextField tf1=new JTextField();
        tf1.setBounds(20,40, 150,18);
        JTextField tf2=new JTextField();
        tf2.setBounds(20,100, 150,18);
        tf3=new JTextArea();
        tf3.setEnabled(false);
        tf3.setBounds(20,160, 300,100);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);

        JButton b1=new JButton("Cadastrar");//creating instance of JButton
        b1.setBounds(260,280,100, 20);//x axis, y axis, width, height
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexao(tf1.getText(),Integer.parseInt(tf2.getText()));
            }
        });

        f.add(b1);//adding button in JFrame

        f.setSize(400,400);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
    
    public static void main(String[] args) {

        janela();

    }

    private static void conexao(String nome, int idade) {
        try {

            socket = new Socket("127.0.0.1", 50000);

            saida = new ObjectOutputStream(socket.getOutputStream());
            entrada = new DataInputStream(socket.getInputStream());

            Pessoa pessoa = new Pessoa(nome,idade);

            saida.writeObject(pessoa);
            boolean recebido = entrada.readBoolean();

            if(recebido){
                tf3.setText("Recebeu do Servidor: \n Dados recebidos corretamente;");
            }

            socket.close();

        } catch(Exception e) {
            tf3.setText("erro");

        }
    }

}
