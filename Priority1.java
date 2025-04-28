class first extends Thread
{
    
    public void run()
    {
        System.out.println("first");
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class Second extends Thread
{
    
    public void run()
    {
        System.out.println("third");
        for(int i=11;i<=20;i++)
        {
            System.out.println(i);
        }
    }
}
class Third extends Thread
{
    
    public void run()
    {
        System.out.println("second");
        for(int i=21;i<=30;i++)
        {
            System.out.println(i);
        }
    }
}
class Priority1 
{
    public static void main(String[] args) throws InterruptedException
    {
        first obj1 = new first();
        Second obj2 = new Second();
        Third obj3 = new Third();
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.NORM_PRIORITY);
        obj1.start();
        obj2.start();
        obj3.start();
    }
}