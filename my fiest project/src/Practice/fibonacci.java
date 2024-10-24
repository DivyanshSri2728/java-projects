package Practice;
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
        int a=0;
        int b=1;
        int num;
        System.out.println("Enter the limit of your series:");
        num=obj.nextInt();
        System.out.print(a+", "+b);
        for( int i=2;i<num;i++){
           int next=a+b;
           System.out.print(", " +next);
          a=b;
          b=next;
        }
    }
  

}
