import java.util.Scanner;
// program to find the sum and average of the elements of the arrays

class Sum_Average{
    public static void main(String[] args)
    {
        int n,sum=0,avg;

    System.out.println("enter the no.of elements in the arrays");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    System.out.println("enter all the elements of the array");
    int[] a = new int[n];

    for(int i =0;i<n;i++)
    {
        a[i]=sc.nextInt();
        sum = sum + a[i];

    }
    // sum of the elements of the array
    System.out.println("the sum of the elements of the arrays is "+sum);

    System.out.println("the average of the elements of the arrays is "+sum/n);
    }
}

