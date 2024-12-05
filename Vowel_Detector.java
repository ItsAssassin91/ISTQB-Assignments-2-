import java.util.Scanner;
public class Vowel_Detector {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your letter");
        char letter = scanner.next().charAt(0);
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("Letter is a vowel");
            
        } else {
            System.out.println("Letter is not a vowel");
        }
        
        scanner.close();

	}

}
