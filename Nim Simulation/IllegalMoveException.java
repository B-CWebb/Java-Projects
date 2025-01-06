import java.lang.Exception;
import java.io.Serializable;
public class IllegalMoveException extends Exception implements Serializable{

	private static final long serialVersionUID = 1L;

	public IllegalMoveException (String moveInfo)
	{
		super(moveInfo);
	}
}
