import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
       int a,b;
       System.out.println("Enter the 1st number:");
       a=obj.nextInt();
       System.out.println("Enter the 2nd number:");
       b=obj.nextInt();
       if(a>b)
       {
        System.out.println(a+" is greater than "+b);
       }
       else{
        System.out.println(b+" is grater than "+a);
    }
       }
        
        }
    

