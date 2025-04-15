//it is parametrized constructor

class ConstDemo{

    double l,b;

    ConstDemo(double x,double y)
    {
       l=x;
       b=y;
    }
    void DisplayArea()
    {
        System.out.println("the area of the rectangle is "+l*b);
    }
    public static void main(String[] args)
    {
        ConstDemo obj1 = new ConstDemo(5,4);
        obj1.DisplayArea();
    }

}