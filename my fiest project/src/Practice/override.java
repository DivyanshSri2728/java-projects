package Practice;
class vehicle{
    void drive(){
        System.out.println("Car is damaged");
    }
}
class car extends vehicle{
    @Override
    void drive(){
     System.out.println("Repairing a car");
    }
}
public class override {
    public static void main(String[] args) {
        car obj=new car();
        obj.drive();
    }
}
