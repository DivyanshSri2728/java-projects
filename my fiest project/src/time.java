import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter the 1st number");
        a=obj.nextInt();
        System.out.println("Enter the 2nd number");
        b=obj.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a is "+ a);
        System.out.println("value of b is "+ b);
    }
}
