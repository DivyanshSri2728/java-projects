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
class GRANDSON extends SON{
    void print(){
        System.out.println("This is the GRANDSON class");
    }
}
public class multi{
public static void main(String[] args) {
    GRANDSON grandson=new GRANDSON();
    grandson.display();
    grandson.show();
    grandson.print();
}
}
    

