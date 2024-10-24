interface X{
    void displayX();
   }
   interface Y{
       void displayY();
      }
      
   
   class Z implements X,Y{
       public void displayX(){
           System.out.println("display x");
       }
   
   public void displayY(){
       System.out.println("display y");
   }
}
   public class inter {
       public static void main(String[] args) {
           Z obj=new Z();
           obj.displayX();
           obj.displayY();
       }
   }
