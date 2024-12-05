import java.util.Scanner;
public class Grade_Detector {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("input your grade: ");

        double grade = scanner.nextInt();

        if (grade >=90) {
            System.out.print("Your grade is A");
 }else if (grade >=80) {
     System.out.print("Your grade is A");
 }else if (grade >=70) {
     System.out.print("Your grade is B");
 }else if (grade >= 60) {
     System.out.print("Your grade is C");
 }
 else {
     System.out.print("Your grade is F");
 }
	}

}
