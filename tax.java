import java.util.Scanner;
class tax{
    public static void main(String args[]){
       
        Scanner sc =new Scanner(System.in);
        System.out.println("income-->");
        int income = sc.nextInt();
        
        System.out.println("category-->");
        char c = sc.next().charAt(0);

        int tax=0;
       
        if(c=='g'){
            if(0<=income && income<=180000)
            {
                System.out.println("no tax");
            }
            if(180001<=income && income<=500000)
            {
                tax=(10*income)/100;
                System.out.println("tax is "+tax);
            }   
            if(500001<=income && income<=800000)
            {
                tax=(20*income)/100;
                System.out.println("tax is "+tax);
            }
            if(income>800001)
            {
                tax=(30*income)/100;
                System.out.println("tax is "+tax);
            }
        }

        if(c=='w')
        {
            if(0<=income && income<=190000)
            {
                System.out.println("no tax");
            }
            if(190001<=income && income<=500000)
            {
                tax=(10*income)/100;
                System.out.println("tax is "+tax);
            }
            if(500001<=income && income<=800000)
            {
                tax=(20*income)/100;
                System.out.println("tax is "+tax);
            }
            if(income>800001)
            {
                tax=(30*income)/100;
                System.out.println("tax is "+tax);
            }
        }    

    }
}