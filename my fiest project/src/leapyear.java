import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int year;
        System.out.println("Enter the year");
        year=obj.nextInt();
        if (year%4==0 && year%400==0) {
          System.out.println( year+" is a leap year");            
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }

   
}
