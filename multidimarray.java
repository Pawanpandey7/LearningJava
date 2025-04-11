// program to enter two 3*3 matrix and add them 
// now i need to think earlier how can i add the matrices 
// as far as i remember while additing the matrixes i used to add the each element of the matrix with the element of the same element in another matrix
// how can i ececute it of course i need to create nested loop to take the input from of the matrix
// after taking the matrix i can again make a loop to add the elemnts of the each of the matrix 

import java.util.Scanner;

class Addingmatrix{
    public static void main(String[] args)
    {
        // let me define the matrixes

    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int [][] c = new int[3][3];

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first 3*3 matrix");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            a[i][j] = sc.nextInt();
        }
        
    }
    System.out.println("enter the seconf 3*3 matrix");

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            b[i][j] = sc.nextInt();
        }
    }

    System.out.println(" the sum of the two 3*3 matrix is ");

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            c[i][j] = a[i][j]+b[i][j];
            System.out.print(c[i][j]+ " ");
        }
        System.out.print("\n");
        
    }
    }
}