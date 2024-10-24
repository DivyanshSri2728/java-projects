interface x{
    void displayX();
}
interface y{
    void displayY();
}

class Z implements x,y{
  public void displayX(){
    System.out.println("display x");
  }
  public void displayY(){
    System.out.println("display y");
  }
}

public class multil {
    public static void main(String[] args) {
        Z obj=new Z();
        obj.displayX();
        obj.displayY();
    }
}
