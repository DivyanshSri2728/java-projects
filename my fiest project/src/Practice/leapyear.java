package Practice;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
       int year;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter your year:");
       year=obj.nextInt();
       if(year%4==0 && year%400==0){
        System.out.println(year+" is a leap year");
       }
       else{
        System.out.println(year+" is not a leap year");
       }
    }
}
