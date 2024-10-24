public class cons3 {
    String name;
    int age;
    cons3(String name, int age){
        this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
        cons3 obj=new cons3("RASHI", 19);
        obj.display();
    }
}
