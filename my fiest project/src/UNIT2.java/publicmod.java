public class publicmod {
    public int num=30;
    public void display(){
        System.out.println("Public method");
    }
}
class divyansh{
    public static void main(String[] args) {
        publicmod obj=new publicmod();
        System.out.println("Number:"+obj.num);
        obj.display();
    }
}