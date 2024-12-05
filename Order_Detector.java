import java.util.Scanner;
public class Order_Detector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your 3 values: ");
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        if (x > y && x > z) {
            if (y > z) {
                System.out.println("Order is: X > Y > Z");
            } else {
                System.out.println("Order is: X > Z > Y");
            }
        } else if (y > x && y > z) {
            if (x > z) {
                System.out.println("Order is: Y > X > Z");
            } else {
                System.out.println("Order is: Y > Z > X");
            }
        } else {
            if (x > y) {
                System.out.println("Order is: Z > X > Y");
            } else {
                System.out.println("Order is: Z > Y > X");
            }
        }

        scanner.close();
	}

}
