import  java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float tax=0;
        System.out.println("Enter the income by the employ ");
        float income=sc.nextFloat();
        if(income<=2.5) {
            tax= 0;
        } else if (income >=2.5 && income<=5f) {
            tax=tax+0.5f*(income-2.5f);

        }
        else if (income >=5.0 && income<=10.0f) {
            tax = tax + 0.5f * (5f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income >=10.0 ) {
            tax = tax + 0.5f * (5f - 2.5f);
            tax = tax + 0.2f * (10.f - 5f);
            tax=  tax + 0.3f *(income -10.f);


        }
        System.out.println("THE TAX ON A EMPLOY:"+tax);
        }
}