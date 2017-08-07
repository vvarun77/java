import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.print("grade");
		Scanner scanner = new Scanner(System.in);
		int grade = scanner.nextInt();

		if (grade <= 5) {
			System.out.println("elementary");

		} else if (grade >= 5 && grade <= 9) {
			System.out.println("middle");
			
		} else if (grade >= 8 && grade <= 13) {
			System.out.println("high");
			
		} else {
			System.out.println("college");
		}
	}

}
