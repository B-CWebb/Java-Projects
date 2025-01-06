
public class Cone implements Shape3D{
	private double radius;
	private double height;
	
	public Cone(double radius, double height){
		this.radius = Math.abs(radius);
		this.height = Math.abs(height);
		
	}
	
	public double volume()
	{
		double volume;
		volume = ((Math.PI) * (Math.pow(radius, 2)) * (height/3));
		return volume;
	}
	
	public double surfaceArea() 
	{
		double surfaceArea;
		surfaceArea = ((Math.PI)*(radius))*(radius + Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
		return surfaceArea;
	}
}