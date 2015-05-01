import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println("1) Checking or Returning a Book");
		System.out.println("2) Checking or Returning a Movie");
		System.out.println("3) Buying Music");
		int choice1 = intInput.nextInt();
		// Books
		if (choice1 == 1) {
			System.out
					.println("How many books are you returning or checking out?");
			int bookNum = intInput.nextInt();
			Books books[] = new Books[bookNum];
			for (int x = 0; x < bookNum; x++) {
				books[x] = new Books();
			}
			Scanner str1 = new Scanner(System.in);
			for (int index = 0; index < bookNum; index++) {
				System.out
						.println("Enter the name of the book you are checking out or returning.");
				String bookName = str1.nextLine();
				books[index].add(bookName);
			}

			for (int index = 0; index < bookNum; index++) {
				books[index].showData();
			}

			// Movies

		} else if (choice1 == 2) {
			System.out
					.println("How many movies are you returning or checking out?");
			int movieNum = intInput.nextInt();
			Movies movies[] = new Movies[movieNum];
			for (int x =0; x<movieNum; x++)
			{
				movies[x] = new Movies();
			}
			Scanner str2 = new Scanner(System.in);
			System.out
					.println("Enter the name of the movie you are checking out or returning.");
			String movieName = str2.nextLine();

			// Music
		} else if (choice1 == 3) {
			System.out.println("How many songs are you buying?");
			int musicNum = intInput.nextInt();
			System.out.println("Enter the name of the music you are buying.");
			Scanner str3 = new Scanner(System.in);
			String musicName = str3.nextLine();

			// Other
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

	public void add(String n) {
		bookName = n;
	}

	public void showData() {
		System.out.println("Thank you for checking/returning this book:");
		System.out.println(bookName);
		System.out.println();
	}

}

class Movies {
	private String movieName;

	public Movies() {
		movieName = "";
	}

	public Movies(String n) {
		add(n);
	}

	public void add(String n) {
		movieName = n;
	}

	public void showData() {
		System.out.println("Thank you for checking/returning this book:");
		System.out.println(movieName);
		System.out.println();
	}
}

class Music {
	private String musicName;
}