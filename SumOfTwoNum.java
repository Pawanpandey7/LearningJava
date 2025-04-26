import myfirstpackage.AddOperation;

public class SumOfTwoNum{
    public static void main(String[] args)
    {
        AddOperation obj1 = new AddOperation();
        System.out.println("sum of 2 and 3 is "+obj1.Sum(2,3));
        System.out.println("difference of 3 and 2 is "+obj1.Diff(3.5f,2.2f));

    }
}
