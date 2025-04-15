class ConstDemo{

    double l,b;

    ConstDemo()
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
        ConstDemo obj1 = new ConstDemo();
        obj1.DisplayArea();
    }

}