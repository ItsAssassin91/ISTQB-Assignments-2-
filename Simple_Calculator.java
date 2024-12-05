import java.util.Scanner;
public class Simple_Calculator {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kindly input your 2 values: ");
        
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        System.out.println("Kindly input your operation (+,-,*,/): ");
        char op = scanner.next().charAt(0);
        
        if (op == '+') {
            System.out.println(x+y);
        } else if (op == '-') {
            System.out.println(x-y);
        } else if (op == '*') {
            System.out.println(x*y);
        } else if (op == '/') {
            if (y!=0) {
                System.out.println(x/y);
            }
            else {
                System.out.println("Invalid number must be greater than 0");
            }
        }
        else {
            System.out.println("Invalid operator");
	}

}
