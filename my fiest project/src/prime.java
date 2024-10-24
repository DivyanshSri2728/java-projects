public class prime{
    public static void main(String[] args) {
        int i,num=29;
        boolean isPrime=true;
        for(i=2;i<num/2;i++){
         if (num%i==0) {
            isPrime=false;
            break;
         }
        }
    }
}

