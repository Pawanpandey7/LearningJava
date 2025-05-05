// interface declares the methods and fields but doesnot provide the implemention. They are like the class but they only provide the signature a
// and not the actually implementations. we can implement the methods in the interface by creating class and using the implement keyword.

interface interfaceEx
{
    public int age = 23;
    public void displayAge();

}
class interface01 implements interfaceEx
{
    public void displayAge()
    {
        System.out.println("i am "+age+" years old");
    }

    public static void  main(String[] args)
    {
        interface01 obj1 = new interface01();
        obj1.displayAge();
    }



}