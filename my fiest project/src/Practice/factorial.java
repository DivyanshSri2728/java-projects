package Practice;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fact=1;
        int num;
        int temp;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter you no.:");
        num=obj.nextInt();
        temp=num;
        while(num!=0){
            fact=fact*num;
            num--;
         }
         System.out.println("Factorial of "+temp+"="+fact);
        }
    
}
