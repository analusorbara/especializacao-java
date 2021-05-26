package prova;

import java.rmi.RemoteException;

public class CalculadoraImpl implements Calculadora{

    @Override
    public long add(long a, long b) throws RemoteException {
        return a+b;
    }

    @Override
    public long sub(long a, long b) throws RemoteException {
        return a-b;
    }

    @Override
    public long mul(long a, long b) throws RemoteException {
        return a*b;
    }

    @Override
    public long div(long a, long b) throws RemoteException {
        return a/b;
    }
}
