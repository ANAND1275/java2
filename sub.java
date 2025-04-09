import java.util.scanner
public class sub{
    public static void main(string[]args){
        scanner scanner = new scanner(system.in);
        system.out.println("Enter the first number");
        int a = scanner.nextInt();

        system.out.println("Enter the second number");
        int b = scanner.nextInt();

        int sub = a - b;

        system.out.println("The sub of"+a+"and"+b+"is"+sub);

        scanner.close();
    }
}