import java.util.Scanner;
public class lucase {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=obj.next().charAt(0);
        if (ch>='A'&& ch<='Z') {
            System.out.println(ch+" is uppercase character");
        }
        else if (ch>='a'&& ch<='z') {
            System.out.println(ch+" is lowercase character");
        }
    }
}
