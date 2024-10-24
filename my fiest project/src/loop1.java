import java.util.Scanner;
public class loop1 {
   public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int i,n;
    System.out.println("Enter the number");
    n=obj.nextInt();
    for(i=1;i<=n;i++)
    {
        System.out.println(i);
    }
   }
   
}
