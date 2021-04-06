package com.company;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {

    private static Socket socket;
    private static DataInputStream entrada;
    private static DataOutputStream saida;

  public static void main(String[] args) {

      try{

          socket = new Socket("127.0.0.1", 50000);

          entrada = new DataInputStream(socket.getInputStream());
          saida = new DataOutputStream(socket.getOutputStream());

          //receber do usuario algum valor

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Digite algum cpf:");
          String valor = br.readLine();

          //o valor é enviado ao servidor
          saida.writeUTF(valor);

          //recebe-se o resultado do servidor

          String resultado = entrada.readUTF();

          //mostra o resultado na tela

          System.out.println(resultado);

          socket.close();

      } catch (Exception e){

      }

    }
}
