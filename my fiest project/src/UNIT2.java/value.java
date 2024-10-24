public class value {
    int add( int a,int b){
        return a+b;
    }
  public static void main(String[] args) {
    value obj=new value();
    int result=obj.add(4, 6);
    System.out.println("SUM:"+result);
  }
}
