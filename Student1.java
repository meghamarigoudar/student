import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student1 {
    private static Scanner scanner = new Scanner(System.in);

    void display() {
        System.out.println("Enter your name:");
        String n = scanner.nextLine();
        System.out.println("Name is " + n);
    }

    void age(LocalDate bd) {
        LocalDate today = LocalDate.now();
        int year = Period.between(bd, today).getYears();
        System.out.println("Today's date is " + today);
        System.out.println("Your birthdate is " + bd);
        System.out.println(year + " years completed");
    }

    public static void main(String args[]) {
        Student1 s1 = new Student1();
        s1.display();
        System.out.println("Enter your birthdate (dd/MM/yyyy):");
        String date = scanner.nextLine(); // Use nextLine() to read the entire line
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bd = LocalDate.parse(date, formatter);
        s1.age(bd);
        scanner.close(); // Close the scanner object at the end of the program
    }
}
