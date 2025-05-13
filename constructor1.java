// default constructor or non parameterized constructor
class constructor1{

    double l,b;

    constructor1()
    {
       l=10;
       b=20;
    }
    void DisplayArea()
    {
        System.out.println("the area of the rectangle is "+l*b);
    }
    public static void main(String[] args)
    {
        constructor1 obj1 = new constructor1();
        obj1.DisplayArea();
    }

}