class display{
    void show(int a){
        System.out.println("Number:"+a);
    }
    void show(String a){
        System.out.println("NAME:"+a);
    }
}
public class over {
public static void main(String[] args) {
    display obj=new display();
    obj.show("RASHI");
    obj.show(01);
    
}    
}
