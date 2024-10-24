import java.util.Scanner;
class customer{
    void custdetails(){
        String name;
        int id;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your name:");
        name=obj.nextLine();
        System.out.print("Enter your id:");
        id=obj.nextInt();
    }
        
}
class transaction extends customer{
    customer obj=new customer();
    int dep;
    int with;
    int tot;
    void deposit(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the amt. to deposit:");
        dep=obj.nextInt();
        
    }
    void withdraw(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the amt. to withdraw:");
        with=obj.nextInt();
       
    }
    void total(){
        tot=tot+dep;  
        tot=tot-with;
        System.out.println("Total amount is:"+tot);
    }
}
public class bank {
    public static void main(String[] args) {
        int i;
        Scanner obj=new Scanner(System.in);
        transaction ob=new transaction();
        do{   
        System.out.println("Enter 1 for customer detail:");
            System.out.println("Enter 2 to deposit:");
            System.out.println("Enter 3 to withdraw:");
            System.out.println("Enter 4 to display total amount:");
            System.out.println("Enter 5 to exit:");
            System.out.print("Enter your choice:");
            i=obj.nextInt();
        switch (i) {
            case 1:
            ob.custdetails();
            break;

            case 2:
            ob.deposit();
            break;
           
            case 3:
            ob.withdraw();
            break;

            case 4:
            ob.total();
            break;
            default:
            System.out.println("Ivalid choice");
                break;
            } 
    }while(i!=5); 
}  
}


