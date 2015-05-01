import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) Checking or Returning a Book");
		System.out.println("2) Checking or Returning a Movie");
		System.out.println("3) Checking or Returning Music");
		int choice1 = intInput.nextInt();

		if (choice1 == 1) {

		} else if (choice1 == 2) {

		} else if (choice1 == 3) {

		} else {
			System.out.println("That is not a choice");
		}
	}
}

class Books {
	private String bookName;
}

class Movies {
	private String movieName;
}

class Music {
	private String musicName;
}