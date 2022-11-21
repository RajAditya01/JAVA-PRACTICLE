import java.net.SocketPermission;
import java.net.SocketTimeoutException;

class Adder
{
    long add(int a , long b){
        return a+b;
    }
    int add (int a, int b, int c){
        return a+b+c;
    }
    double add (double a, double b){
        return a+b;
    }
    double add (double a, double b,double c){
        return a+b+c;
    }
    
    
}
public class Calculator {
    public static void main(String[] args) {
        Adder ob= new Adder();
        long x = ob.add(1, 2);
        System.out.println(x);
        System.out.println(ob.add(1,2,3));
        System.out.println(ob.add(13.4,2.4));
        System.out.println(ob.add(2.4,6.5,7.8));
    }
}
