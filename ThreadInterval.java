class First extends Thread
{
    public void Display()
    {
        for(int i=1;i<=10;i++)
        {
            try{
                System.out.println(i);
                Thread.sleep(500);
            }
        
            catch(InterruptedException e)
            {
            System.out.println(e.getMessage());
            }
        }
    }
}
class Second extends Thread
{
    public void Display()
    {
        for(int i=11;i<=20;i++)
        {
            try{
                System.out.println(i);
                Thread.sleep(1000);
            }
        
            catch(InterruptedException e)
            {
            System.out.println(e.getMessage());
            }
        }


    }

}
class ThreadInterval
{
    public static void main(String[] args)
    {
        First obj1 = new First();
        Second obj2 = new Second();
        obj1.Display();
        obj2.Display();
    }
}