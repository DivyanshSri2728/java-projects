import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=obj.nextInt();
        if (n%2==0) {
          System.out.println(n +" No. Is even ");
        }
        else{
            System.out.println(n +" No. Is odd");
        }
    }
}
