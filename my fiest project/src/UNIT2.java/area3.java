import java.util.Scanner;
public class area3 {
    void Carea(){
        double area, pi=3.14;
        double r=3.5;
        area=pi*r*r;
        System.out.println("Area of circle is:"+area);
    }
    void Rarea(){
        double area,l=3.5,b=5.9;
        area=l*b;
        System.out.println("Area of Rectangle is:"+area);
    }
    void Sarea(){
        double area,s=9.1;
        area=s*s;
        System.out.println("Area of Square is:"+area);
    }
    public static void main(String[] args) {
        int a;
        area3 obj1=new area3();
        area3 obj2=new area3();
        area3 obj3=new area3();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for Circle area");
        System.out.println("Enter 2 for Rectangle area");
        System.out.println("Enter 3 for Square area");
        System.out.println("Enter the no:");
        a=obj.nextInt();
        switch (a) {
            case 1:
                obj1.Carea();
                break;
            case 2:
                obj2.Rarea();
                break;
            case 3:
                obj3.Sarea();
                break;    
            default:
              System.out.println("Invalid choice");    
            break;
        }
    }
}
