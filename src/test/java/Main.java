import org.Employee.Developer;
import org.Employee.Employee;

public class Main {
    // Define the main method which is the entry point of the program
    public static void main(String[] args) {

        // Create an instance of the Employee class with the name "Franziska Waltraud", job title "HR Manager", and salary 40000
        Developer developer1 = new Developer("Franziska Waltraud", "HR Manager", 40000, "PC","Java");
        // Create another instance of the Employee class with the name "Hubertus Andrea", job title "Software Engineer", and salary 60000
        Developer developer2 = new Developer("Hubertus Andrea", "Software Engineer", 60000, "PC", "Java");

        // Print a heading for the employee details section
        System.out.println("\nEmployee Details:");
        // Print the details of employee1
        developer1.printEmployeeDetails();
        // Print the details of employee2
        developer2.printEmployeeDetails();

        // Raise the salary of employee1 by 8%
//        employee1.raiseSalary(8);
//        // Raise the salary of employee2 by 12%
//        employee2.raiseSalary(12);

        // Print a heading indicating that the salaries have been raised
        System.out.println("\nAfter raising salary:");
        // Print a heading for the salary raise details of employee1
        System.out.println("\n8% for 'Franziska Waltraud':");
        // Print the updated details of employee1
        developer1.printEmployeeDetails();
        // Print a heading for the salary raise details of employee2
        System.out.println("\n12% for 'Hubertus Andrea':");
        // Print the updated details of employee2
        developer2.printEmployeeDetails();
    }
}