class shape{
    double getArea(int r){
       double pi=3.14;
       double area=pi*r*r;
       return area;
    }
    double getParameter(int r){
        double pi=3.14;
        double perimeter=2*pi*r;
        return perimeter;
     }

}
class circle extends shape{
    @Override
    double getArea(int r){
        double pi=3.14;
        double area=pi*r*r;
        return area;
     }
     double getParameter(int r){
         double pi=3.14;
         double perimeter=2*pi*r;
         return perimeter;
      }
}
public class override2 {
    public static void main(String[] args) {
        circle ob=new circle();
        System.out.println("Area of circle="+ob.getArea(5));
        System.out.println("Perimeter of circle"+ob.getParameter(5));
    }
}
