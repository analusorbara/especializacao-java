package prova;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente1 {
    public static void main(String[] args) throws InterruptedException, RemoteException, NotBoundException {
        Cliente.chamarCalculadora();
    }
}
