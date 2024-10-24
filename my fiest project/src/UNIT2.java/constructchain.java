class Box{
    int length;
    int width;
    int height;

Box(){
  this(10,20,30);
}
Box(int length,int width,int height){
    this.length=length;
    this.height=height;
    this.width=width;
}
}
public class constructchain {
    public static void main(String[] args) {
        
    
    Box b=new Box();
    System.out.println("Box dimension:"+b.length+"x"+b.width+"x"+b.height);
}
}