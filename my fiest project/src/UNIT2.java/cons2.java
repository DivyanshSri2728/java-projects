public class cons2 {
    String msg;
    cons2(String msg){
        this.msg=msg;
    }
    void display(){
        System.out.println("MESSAGE: "+msg);
    }
    public static void main(String[] args) {
        cons2 obj=new cons2("HELLO WORLD");
        obj.display();
    }
}
