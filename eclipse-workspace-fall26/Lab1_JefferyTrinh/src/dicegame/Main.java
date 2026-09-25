package dicegame;
import dicegame.RandomIntegers; // doing this because of As. 1 but isn't necessary in this case because they're in same package

public class Main {
	public static void main(String[] args) {
		RandomIntegers ri = new RandomIntegers();
		System.out.println("FOUR DICE GAME");
		System.out.println("Roll 7, 11, 15 or 21 to win");
		int sum = ri.RandInt(); // 1st roll
		if (sum == 7 || sum == 11 || sum == 15 || sum == 21) // win condition, "||" means "or"
		{
			System.out.println("You win");
		}
		else if (sum == 10 || sum == 12 || sum == 19 || sum == 20 || sum == 22 || sum == 23 || sum == 24) // lose condition
		{
			System.out.println("You lose");
		}
		else // other scenario
		{
			int goal = sum;
			System.out.println("New goal number: " + goal + ". Roll " + goal + " again to win.\nRoll 13 and you lose.");
			while (true)
			{
				System.out.println("\nRolling again...");
				sum = ri.RandInt();
				if (sum == goal) // sum of roll equals goal -> win
				{
					System.out.println("You win");
					break;
				}
				else if (sum == 13) // sum of roll equals 13 -> lose
				{
					System.out.println("You lose");
					break;
				}
			}
		}
	}
}