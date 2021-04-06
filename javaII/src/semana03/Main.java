package semana03;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String filePath = Paths.get("").toAbsolutePath().toString() + "/test.bin";

        Cachorro amper = new Cachorro(2, 8.75, "Amper");
        Cachorro napoelao = new Cachorro(12, 10.75, "napoleao");
        Cachorro tiririca = new Cachorro(3, 12.88, "tiririca");

        writeObjectToFile(filePath, amper, napoelao, tiririca);

        ArrayList<Cachorro> cachorros = readObjectFromFile(filePath);

        assert cachorros != null;
        for(Cachorro ca: cachorros) {
            System.out.println(ca);
        }
    }

    private static void writeObjectToFile(String filePath, Cachorro... values) {
        try {
            BufferedOutputStream buffOut = new BufferedOutputStream(new FileOutputStream(filePath));
            ObjectOutputStream objectOut = new ObjectOutputStream(buffOut);

            ArrayList<Cachorro> arrayListValues = new ArrayList<>(Arrays.asList(values));
            objectOut.writeObject(arrayListValues);

            objectOut.close();

            System.out.println("Os objetos foram escritos no arquivo");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static ArrayList<Cachorro> readObjectFromFile(String filePath) {
        try {
            BufferedInputStream buffIn = new BufferedInputStream(new FileInputStream(filePath));
            ObjectInputStream objectIn = new ObjectInputStream(buffIn);

            ArrayList<Cachorro> arrayListValues = (ArrayList<Cachorro>)objectIn.readObject();

            objectIn.close();
            System.out.println("Os objetos foram lidos do arquivo");

            return arrayListValues;
        } catch (Exception ex) {
            ex.printStackTrace();

            return null;
        }
    }
}
