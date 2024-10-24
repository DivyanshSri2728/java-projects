import java.util.Scanner;
public class while1{
   public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int i,n;
    System.out.println("Enter the number");
    n=obj.nextInt();
    i=1;
    do{
        System.out.println(i);
        i++;
    }while(i<=n);
   
}
}