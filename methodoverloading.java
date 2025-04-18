// when a class has two or more methods with same name but different parameters then when we call the method then the method is called which
//parameters matches the arguments that we pass while calling the method

class Overload
{
    public int Sum(int a, int b)
    {
        return a+b;
    }
    public void Sum(int a, int b, int c)
    {
        int d=a+b+c;
        System.out.println("the sum of the numbers is "+d);
    }
    public void Sum(double a, double b)
    {
        double c = a+b;
        System.out.println("the sum of the numbers is"+c);
    }
    public static void main(String[] args)
    {
        Overload obj1 = new Overload();
        System.out.println("the sum of the numbers is "+obj1.Sum(2,3));
        obj1.Sum(1,2,3);
        obj1.Sum(10.5,20.5);
    }
}