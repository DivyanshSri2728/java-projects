import java.util.Scanner;
public class vowel {
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    char ch;
    System.out.println("Enter the chaacter");
    ch=obj.next().charAt(0);
    if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
        System.out.println(ch+" is vowel");
        }
    else{
        System.out.println(ch+" is consonant");
    }    
}
    
}