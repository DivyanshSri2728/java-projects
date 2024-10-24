//class PAPA
class PAPA{
    void display(){
        System.out.println("This is the papa class");
    }
}
//class SON
class SON extends PAPA{
    void show(){
        System.out.println("This is the child class");
    }
}
    
public class Single {

    public static void main(String[] args) {
        SON son=new SON();
        son.display();
        son.show();
    }
}
    

