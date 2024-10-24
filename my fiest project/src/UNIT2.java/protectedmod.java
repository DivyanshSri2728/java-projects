  class protectedmod {
    protected int number=20;
    protected void display(){
        System.out.println("Protected method");
    }
}
class subclass extends protectedmod{
    void show(){
        System.out.println(number);
       display();
    }
}
class rashi{
    public static void main(String[] args) {
        subclass obj=new subclass();
        obj.show();
    }
}