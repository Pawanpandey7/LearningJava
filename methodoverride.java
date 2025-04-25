// method overt=riding means that the the method in the subclass has the same name and signature(parameters,returntype etc) which provides the new implementation 
// of the method. we can access the overridden method using super keyword
class parent{
    public void animal()
    {
        System.out.println("dog says bhow bhow");
    }
}
class child extends parent{
    public void animal()
    {
        super.animal();
        System.out.println("cat says meou meau");
    }
}
class methodoverride{
    public static void main(String[] args)
    {
        child obj1 = new child();
        obj1.animal();
    }
}