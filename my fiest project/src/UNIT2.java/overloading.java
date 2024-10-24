class overlaod{
    void add(int a,int b){
         int c=a+b;
         System.out.println("Addition of two numbers: "+c);
    }
    void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("Addition of three numbers: "+d);
   }
}
public class overloading{
    public static void main(String[] args) {
        overlaod obj=new overlaod();
        obj.add(8, 9);
        obj.add(7, 06, 05  );
    }
}