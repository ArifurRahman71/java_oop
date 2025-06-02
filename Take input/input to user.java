import java.util.Scanner;

public class MultipleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a full line

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter your city: ");
        String city = scanner.nextLine(); // Reads another full line

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();
    }
}
