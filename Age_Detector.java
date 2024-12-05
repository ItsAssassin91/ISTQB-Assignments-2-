import java.util.Scanner;
public class Age_Detector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        int age = scanner.nextInt();

        if (age > 30) {
        System.out.print("You are old!");
        }
        else {
            System.out.print("You are young");
        }
	}

}
