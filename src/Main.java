public class Main {
    public static void main(String[] args) {

        // Create Instructor object
        Instructor instructor = new Instructor();

        // Assign inherited attributes from Person
        instructor.FN = "John";
        instructor.LN = "Smith";
        instructor.ID = 101;
        instructor.Email = "jsmith@email.com";

        // Assign Instructor's own attributes
        instructor.Department = "Computer Science";
        instructor.Office = "Room 205";
        instructor.Salary = 50000;

        // Print all attributes
        System.out.println("First Name: " + instructor.FN);
        System.out.println("Last Name: " + instructor.LN);
        System.out.println("ID: " + instructor.ID);
        System.out.println("Email: " + instructor.Email);
        System.out.println("Department: " + instructor.Department);
        System.out.println("Office: " + instructor.Office);
        System.out.println("Salary: " + instructor.Salary);
    }
}