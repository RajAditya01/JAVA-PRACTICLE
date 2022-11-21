import java.util.Scanner;
class eggs
{
   public static void main(String args[]){

   Scanner sc =new Scanner(System.in);
   System.out.println("eggs-->");
   int eggs = sc.nextInt();
   //System.out.println(eggs);

    //  int eggs=1342;
      int gross=0;
      int dozen=0;
      int rem=0;
      gross=eggs/144;
      System.out.println("gross is "+gross);
      rem=eggs-(gross*144);
      dozen=rem/12;
      System.out.println("dozen is "+dozen);
      rem=eggs-(gross*144)-(dozen*12);
      System.out.println("rem is "+rem);
   }
}