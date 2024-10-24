class papa{
    void display(){
        System.out.println("This is the papa class");
    }
}
class son extends papa{
    void show(){
        System.out.println("This is the child class");
    }
}
public class simpleinherit {
    public static void main(String[] args) {
        son obj=new son();
        obj.show();
        obj.display();
    }
}
