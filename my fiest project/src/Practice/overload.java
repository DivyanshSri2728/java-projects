package Practice;
class student{
    void show(int a){
        System.out.println("Age="+a);
    }
    void show(String a){
        System.out.println("Name="+a);
    }
}
public class overload {
    public static void main(String[] args) {
        student obj=new student();
        obj.show("Divyansh");
        obj.show(19);
    }
}
