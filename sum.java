import java.util.Scanner;
class Addtwonum{

    public static void main(String[] args)
    {
        int n1,n2,sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        n1 = sc.nextInt();
        System.out.println("enter the second number");
        n2 = sc.nextInt();

        sum = n1 + n2;

        System.out.println(" the sum of the two numers is "+ sum);          
    }
}