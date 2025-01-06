
public class Driver {

	public static void main(String[] args) {
		MovieQueue ms = new MovieQueue();
		Movie A = new Movie("Texas Chainsaw Massacre", "Horror");
		Movie B = new Movie("Choose or Die", "Horror");
		Movie C = new Movie("No One Gets Out Alive", "Horror");
		ms.add(A);
		ms.add(B);
		ms.add(C);
		
		if (C.equals(ms.remove())) {System.out.println("1");}
		else {System.out.println("0"); }
		if (B.equals(ms.remove())) {System.out.println("1");}
		else {System.out.println("0"); }
		if (A.equals(ms.remove())) {System.out.println("1");}
		else {System.out.println("0"); }
	}
}
