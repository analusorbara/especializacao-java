package Prova;

public class NumException extends Exception{
    public NumException(String s) {

        super(s);
    }

    public void impMsg() {
       System.out.println(getMessage());
    }

    
}
