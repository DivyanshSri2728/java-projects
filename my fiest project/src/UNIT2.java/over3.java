class summer{
    int add(int a ,int b){
        return (a+b);
    }
    double add(double c,double d){
        return (c+d);
    }
    int add(int a,int b,int c){
        return (a+b+c);
    }
}
public class over3 {
public static void main(String[] args) {
    summer obj=new summer();
    System.out.println("Add of 2 no.:"+obj.add(2, 5));
    System.out.println("Add of 2 no.:"+obj.add(4.5, 2.5));
    System.out.println("Add of 3 no.:"+obj.add(4, 5, 6));

}    
}
