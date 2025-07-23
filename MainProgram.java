import java.util.*;
import java.io.*;
class Employee implements Serializable{
    private int empId;
    private String name;
    Employee(int empId,String name){
        this.empId = empId;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.empId +": "+this.name;
    }
}
public class MainProgram{
    public static void main(String[] args){
       try{
            ArrayList<Employee> EmployeeList = new ArrayList<>();
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.doc"));
            EmployeeList.add(new Employee(1,"Pawan"));
            EmployeeList.add(new Employee(2,"Anurag"));
            EmployeeList.add(new Employee(3,"Mohit"));

            for(Employee emp:EmployeeList){
                oos.writeObject(emp);
            }
            oos.close();

       }catch(IOException ex){
        System.out.println(ex.getMessage());

       }

    }

}