import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) Checking or Returning a Book");
		System.out.println("2) Checking or Returning a Movie");
		System.out.println("3) Buying Music");
		int choice1 = intInput.nextInt();

		if (choice1 == 1) {
			System.out
					.println("How many books are you returning or checking out?");
			int bookNum = intInput.nextInt();
			Books books[] = new Books[bookNum];
			for (int x = 0; x<bookNum; x++){
				books[x] = new Books();
			}
			System.out
					.println("Enter the name of the book you are checking out or returning.");
			Scanner str1 = new Scanner(System.in);
			String bookName = str1.nextLine();

		} else if (choice1 == 2) {
			System.out
					.println("How many movies are you returning or checking out?");
			int movieNum = intInput.nextInt();
			System.out
					.println("Enter the name of the movie you are checking out or returning.");
			Scanner str2 = new Scanner(System.in);
			String movieName = str2.nextLine();

		} else if (choice1 == 3) {
			System.out.println("How many songs are you buying?");
			int musicNum = intInput.nextInt();
			System.out.println("Enter the name of the music you are buying.");
			Scanner str3 = new Scanner(System.in);
			String musicName = str3.nextLine();

		} else {
			System.out.println("That is not a choice");
		}
	}
}

class Books {
	private String bookName;

	public Books() {
		bookName = "";
	}

	public Books(String n) {
		add(n);
	}

}

class Movies {
	private String movieName;
}

class Music {
	private String musicName;
}