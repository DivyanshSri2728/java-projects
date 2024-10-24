class division{
    public void divide(int a,int b){
       try{
        int result=a/b;
        System.out.println("Result:"+result);
    }
    catch(ArithmeticException e){
        System.out.println("Cannot divide by zerro");
    }
    
}
}
public class trycatch {
   public static void main(String[] args) {
    division div=new division();
    div.divide(10, 0);
   }    
}
