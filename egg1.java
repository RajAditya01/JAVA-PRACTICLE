import java.io.Console;
public class egg1 {
    public static void main(String args[]){
        Console console= System.console();
        String egg = console.readLine("enter eggs ");
        int gross=0;
        int dozen=0;
        int rem=0;
        gross=(egg/144);
        System.out.println("gross is "+gross);
        
    }
}
