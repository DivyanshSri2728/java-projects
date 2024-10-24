class Rectangle{
    int length;
    int width;
    Rectangle(){
        length=0;
        width=0;
    }
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
}
public class construcoverload {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(5,10);
        System.out.println("Rectangle 1: Length="+r1.length+",Width="+r1.width);
        System.out.println("Rectangle 2: Length="+r2.length+",Width="+r2.width);
    }
}
