interface PAPA{
    void display();
}
interface MAMA{
    void print();
}
class UNCLE implements PAPA{
 public void display(){
 System.out.println("This is the uncle class implementing the PAPA interface");
 }
 void greet(){
    System.out.println("Hello from the uncle class");
 }
}
class SON implements PAPA,MAMA{
    public void display(){
        System.out.println("This is the SON class implementing the PAPA interface");
    }
    public void print(){
        System.out.println("This is the SON class implement the MAMA interface");
    }
    void show(){
        System.out.println("This is the SON class");
    }
}
public class hybrid {
 public static void main(String[] args) {
    SON son =new SON();
    UNCLE uncle =new UNCLE();
    son.print();
    son.show();
    uncle.display();
    uncle.greet();
 }
    
}