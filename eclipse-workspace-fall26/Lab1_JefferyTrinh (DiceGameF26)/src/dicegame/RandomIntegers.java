// Fig. 6.6: RandomIntegers.java
// Shifted and scaled random integers.
package dicegame;

import java.security.SecureRandom; // program uses class SecureRandom
import java.util.ArrayList;
public class RandomIntegers
{
	SecureRandom randomNumbers = new SecureRandom();
	public int RandInt() // is int instead of void because void can not return value (as needed in "return sum;")
	{
		ArrayList<Integer> list = new ArrayList<>();
		int sum = 0; // create sum to calculate total of dice
		System.out.print("Dice rolled: ");
		for (int counter= 1; counter <= 4; counter++) // roll 4 dice
		{
			int face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", face);
			list.add(face); // add to list
			sum += face; // add to sum
		}
		System.out.println();
		System.out.println("Sum = " + sum);
		return sum;
	}
} // end class RandomIntegers