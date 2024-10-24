public class publicmodifier{
    public int number=10;
    public void display(){
        System.out.println("Public method");
    }
}
class divyansh{
    public static void main(String[] args) {
        publicmodifier obj=new publicmodifier();
        System.out.println("Number is:"+obj.number);
        obj.display();
    }
}