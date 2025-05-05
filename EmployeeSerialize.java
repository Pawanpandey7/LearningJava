//Q. Write a java program that writes objects of Employee class in the file named emp.doc.
//Create Employee class as of your interest.
import java.io.*;

class Employee implements Serializable{
    String name;
    int age;
    String department;
    public Employee(String name, int age, String department)
    {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
public class EmployeeSerialize{
    public static void main(String args[])
    {
        try{
            Employee obj1 = new Employee("pawan",22,"BIT");
            Employee  obj2 = new Employee("oli",22,"BIT");
            FileOutputStream fileout = new FileOutputStream("emp.doc");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(obj1);
            out.writeObject(obj2);
            out.close();
            fileout.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }


    }

}