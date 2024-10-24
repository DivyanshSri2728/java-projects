class student{
    String name;
    int age;
    int rollno;
    student(int age,int rollno ){
        this.age=age;
        this.rollno=rollno;
    }
    student(String name,int age,int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;

    }
    void didplay(){

    }
}
public class constructor {
  public static void main(String[] args) {
    student obj=new student("Divyansh srivastava", 20, 47);
    student obj2=new student(23, 48);

  System.out.println("MY name is "+obj.name);


}}