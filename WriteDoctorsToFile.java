import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int empId;
    String name;
    String occupation;

    public Employee(int empId, String name, String occupation) {
        this.empId = empId;
        this.name = name;
        this.occupation = occupation;
    }

    void display() {
        System.out.println(empId + " " + name + " " + occupation);
    }
}

public class WriteDoctorsToFile {
    public static void main(String[] args) {
        // List of sample employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ram", "doctor"));
        employees.add(new Employee(102, "Shyam", "teacher"));
        employees.add(new Employee(103, "Hari", "doctor"));
        employees.add(new Employee(104, "Gita", "engineer"));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DOC.DAT"));
            for (Employee e : employees) {
                if (e.occupation.equalsIgnoreCase("doctor")) {
                    oos.writeObject(e);
                }
            }
            oos.close();
            System.out.println("Doctors written to DOC.DAT successfully.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
