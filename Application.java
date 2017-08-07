import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		System.out.print("numberoflaps");
		Scanner scanner = new Scanner(System.in);
		int numberoflaps = scanner.nextInt();

		System.out.print("runtime");

		int runtime = scanner.nextInt();

		System.out.println(runtime * numberoflaps);
	}

}
