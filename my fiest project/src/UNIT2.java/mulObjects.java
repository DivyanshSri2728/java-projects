class car{
 String model;
 int year;
}
public class mulObjects {
    public static void main(String[] args) {
        car Car1=new car();
        Car1.model="Tata";
        Car1.year=2023;
        car Car2=new car();
        Car2.model="Honda";
        Car2.year=2022;
        System.out.println("Car1:"+Car1.model+",Year"+Car1.year);
        System.out.println("Car2:"+Car2.model+",Year"+Car2.year);
    }
}
