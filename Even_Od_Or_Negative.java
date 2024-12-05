import java.util.Scanner;
public class Even_Od_Or_Negative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your number: ");
        int N = scanner.nextInt();
 if (N>0) {
        if (N%2==0) {
            System.out.print("This number is even");
        }
        else {
            System.out.print("This number is odd");
        }
 }
 else {
     System.out.print("This number is negative");
 }
	}

}
