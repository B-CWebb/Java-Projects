
public class Driver {

	public static void main(String[] args) {
		
		Shape3D s = new Cone(-5,-5);
		if(s.volume() < 0) {
			System.out.println("Negative dimensions."); }
		else {
			System.out.println("Correct!");
		}
		
	
		
		
	}
	
	
}
