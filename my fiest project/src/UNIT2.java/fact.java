public class fact {
    public static void main(String[] args) {
        int fact=1,n=5,temp;
        temp=n;
        do{
            fact=fact*n;
           n--;
        }while(n!=0);
        System.out.println("Factorial of "+temp+"="+fact);
    }
}
