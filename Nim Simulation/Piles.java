import java.util.Arrays;

public class Piles {
	private int[] sizes;
	
	Piles(int... initSizes) throws IllegalArgumentException
	{
		if (initSizes == null || initSizes.length == 0)
		{
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < initSizes.length; i++)
		{
			if (initSizes[i] <= 0)
			{
				throw new IllegalArgumentException();
			}
		}
	
		
		sizes = Arrays.copyOf(initSizes, initSizes.length);
	}
	
	public int[] getSizes()
	{
		return Arrays.copyOf(sizes, sizes.length);
	}
	
	public void removeObjects(int[] move) throws IllegalMoveException
	{
		//Test cases for illegal move inputs. 
		if (move == null)
		{
			throw new IllegalMoveException("null move");
		}
		if (move.length != 2)
		{
			throw new IllegalMoveException("Invalid length: " + move.length);
		}
		{
			if (move[0] < 0 || move[0] > sizes.length-1)
			{
				throw new IllegalMoveException("Index out of bounds: " + move[0]);
			}
		}
		if (sizes[move[0]] == 0)
		{
			throw new IllegalMoveException("Pile " + move[0] + " is empty.");
		}
		if (sizes[move[0]] < move[1])
		{
			throw new IllegalMoveException("Object number greater than pile size: " + move[1] +" > " + sizes[move[0]]);
		}
		if (move[1] < 0)
		{
			throw new IllegalMoveException("Nonpositive object number: " + move[1]);
		}
		
		
		//Actual operation to remove objects
		sizes[move[0]] = sizes[move[0]] - move[1];
		
	}
	

	public boolean isEmpty()
	{
		int total = 0;
		for (int i = 0; i < sizes.length; i++)
		{
			total = total + sizes[i];
		}
		if (total == 0)
		{return true;}
		else
		{return false;}
	}
}
