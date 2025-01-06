import java.util.Random;

public class RandomPlayer extends Player{

	private Random generator;
	
	public RandomPlayer(String name)
	{
		super(name);
		generator = new Random();
	}
	
	public int[] getMove(int[] pileSizes)
	{
		//Establishing the move before assigning variables
		int[] move = new int[2];
		int index;
		int number;
		
		index = generator.nextInt(pileSizes.length);
		while (pileSizes[index] == 0)
		{
			index = generator.nextInt(pileSizes.length);
		}
	
		number = generator.nextInt(pileSizes[index]+1);
		while ((number <= 0))
		{
			number = generator.nextInt(pileSizes[index]+1);
		}
		
		//Prep for returning move
		move[0] = index;
		move[1] = number;
		return move;
		
		
		
	}
	









}
