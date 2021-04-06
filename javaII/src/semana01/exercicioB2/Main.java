package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        File f = new File(String.valueOf(Paths.get(args[0])));

        if(f.exists()){
            System.out.println("Arquivo Existe");
        }
        else {
            System.out.println("Arquivo nao existe");
            try {

                FileWriter fw = new FileWriter(f);
                for (int i =1;i< args.length;i++){
                    fw.write(args[i]+" ");
                }
                fw.close();

            } catch (IOException iox) {
                iox.printStackTrace();
            }
        }

    }
}
