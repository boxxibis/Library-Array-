import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		Scanner stringInput = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		System.out.println("Enter the number of games in your library");
		int NumOfGames = intInput.nextInt();
		
		Games games[] = new Games[NumOfGames];
		for (int x = 0; x<NumOfGames;x++){
			games[x] = new Games();
		}
		for (int index = 0; index < NumOfGames; index++)
		{
			System.out.println("Enter Game Name");
			String name = stringInput.nextLine();
			System.out.println("Enter Game Genre");
			String genre = stringInput.nextLine();
			games[index].add(name, genre);
			
		}
		
		System.out.println();
		for (int index = 0; index < NumOfGames; index++)
		{
			
			games[index].showData();
			
		}

	}
	
}
class Games {
		
		private String name;
		private String genre;
		
		public Games()
		{
			name="";
			genre="";
		}
		
		public Games(String n, String g)
		{
			add(n,g);
		}
		
		public void add(String n, String g)
		{
			
			name = n;
			genre = g;
		}
		
		public void showData()
		{
			
			System.out.println("Name: "+name);
			System.out.println("Genre: "+genre);
			System.out.println();
		}
	}


