import java.util.Scanner;
public class digit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        char ch;
        System.out.println("Enterr the character");
        ch=obj.next().charAt(0);
        if (ch>='0'&&ch<='9') {
         System.out.println(ch+" character is digit");            
        }
        else{
            System.out.println(ch+" character is not digit");
        }
    }
}
