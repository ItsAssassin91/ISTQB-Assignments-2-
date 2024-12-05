import java.util.Scanner;
public class Triangle_Detector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your 3 angles: ");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }

	}

}
