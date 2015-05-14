import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		while (true) {
			Scanner intInput = new Scanner(System.in);
			System.out.println("What would you like to do?");
			System.out.println("1) Checking or Returning a Book");
			System.out.println("2) Checking or Returning a Movie");
			int choice1 = intInput.nextInt();
			// Books
			if (choice1 == 1) {
				System.out.println("Are you...");
				System.out.println("1) Returning a book?");
				System.out.println("2) Checking out a book?");
				int choice2 = intInput.nextInt();
				// Returning Book
				if (choice2 == 1) {
					System.out.println("How many books are you returning?");
					int bookNum = intInput.nextInt();
					Books books[] = new Books[bookNum];
					for (int x = 0; x < bookNum; x++) {
						books[x] = new Books();
					}
					Scanner str1 = new Scanner(System.in);
					for (int index = 0; index < bookNum; index++) {
						System.out
								.println("Enter the name of the book you are returning.");
						String bookName = str1.nextLine();
						books[index].add(bookName);
					}

					for (int index = 0; index < bookNum; index++) {
						books[index].showData();
					}
				}
				// Checking out a Book
				else if (choice2 == 2) {

				} else {
					System.out
							.println("Why choose something that isn't a choice???");
				}

				// Movies

			} else if (choice1 == 2) {
				System.out.println("Would you like to...");
				System.out.println("1) Return a movie?");
				System.out.println("2) Checkout a movie?");
				int choice3 = intInput.nextInt();
				// Returning a Movie
				if (choice3 == 1) {
					System.out.println("How many movies are you returning?");
					int movieNum = intInput.nextInt();
					Movies movies[] = new Movies[movieNum];
					for (int x = 0; x < movieNum; x++) {
						movies[x] = new Movies();
					}
					Scanner str2 = new Scanner(System.in);
					for (int index = 0; index < movieNum; index++) {
						System.out
								.println("Enter the name of the movie you are returning.");
						String movieName = str2.nextLine();
						movies[index].add(movieName);
					}
					for (int index = 0; index < movieNum; index++) {
						movies[index].showData();
					}
					// Checking out a Movie
				} else if (choice3 == 2) {

				} else {
					System.out.println("Not a choice!");
				}

				// Other
			} else {
				System.out.println("OMG THAT IS NOT A CHOICE!!!");
			}
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
		System.out.println("Thank you for returning this book:");
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
		System.out.println("Thank you for returning this movie:");
		System.out.println(movieName);
		System.out.println();
	}
}
