class PAPA{
    void display(){
        System.out.println("This is the PAPA class");
    }
}
class SON extends PAPA{
 void show(){
    System.out.println("This is the SON class");
 }
}
class DAUGHTER extends PAPA{
    void print(){
        System.out.println("This is the DAUGHTER class");
    }
}
public class hierrar {
  public static void main(String[] args) {
    SON son=new SON();
    DAUGHTER daughter=new DAUGHTER();
    son.display();
    son.show();
    daughter.display();
    daughter.print();    
  }    
}
