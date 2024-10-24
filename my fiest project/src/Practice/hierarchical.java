import java.util.*;
class father{
    void show1(){
        System.out.println("This is the father class");
    }
}
class son extends father{
    void display1(){
        System.out.println("This is the son class");
    }
}
class daughter extends father{
    void print1(){
        System.out.println("This is the daughter class");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        son obj=new son();
        obj.show1();
        obj.display1();
        daughter obj2=new daughter();
        obj2.show1();
        obj2.print1();
    }
}
