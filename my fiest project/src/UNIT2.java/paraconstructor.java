class student{
    String name;
    int rollNumber;
    student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;

    }
}

public class paraconstructor {
    public static void main(String[] args) {
        student s=new student("Rashi", 01);
        System.out.println("Name:"+s.name+",Rollno.:"+s.rollNumber);
    }
}
