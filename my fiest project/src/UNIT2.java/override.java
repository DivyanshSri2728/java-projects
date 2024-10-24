class vehicle{
    void drive(){
        System.out.println("Driving the car");
    }
}
class car extends vehicle{
    void drive(){
        System.out.println("Repairing a car");
    }
}   
public class override {
    public static void main(String[] args) {
        car ob=new car();
        ob.drive();
    }
}
