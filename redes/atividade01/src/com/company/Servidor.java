package com.company;

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

            server = new ServerSocket(50000);
            socket = server.accept();

            //criar os fluxos de entrada e saida
            entrada = new DataInputStream(socket.getInputStream());
            saida = new DataOutputStream(socket.getOutputStream());

            //recebimento do valor inteiro

            String valor = entrada.readUTF();

            //processamento do valor

            String resultado = "";
            ValidarCPF validar = new ValidarCPF();

            if (validar.validarCpf(valor))
                resultado = "true";
            else
                resultado = "false";

            //envio dos dados (resultado)

            saida.writeUTF(resultado);

            socket.close();

        } catch (Exception e) {
        }

        }

    }

