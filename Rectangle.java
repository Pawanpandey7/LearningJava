/* Write a Java program to create Rectangle class with data member length and breadth.
Include methods getData and displayArea in the class. Finally create an object of
Rectangle class and display its area.*/

import java.util.Scanner;
class Rectangle{
    int l,b;

    public void getData(int x, int y)
    {
        l=x;
        b=y;
    }
    public int displayArea()
    {
        return l*b;
    }
    public static void main(String[] args)
    {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        l= sc.nextInt();
        System.out.println("enter the breadth");
        b= sc.nextInt();

        // creating the objects
        Rectangle obj1 = new Rectangle();
        obj1.getData(l,b);
        System.out.print("the area of the rectangle is "+obj1.displayArea());
        
    }
}