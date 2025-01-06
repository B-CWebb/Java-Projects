	
public class Triangle
{
	//Class instance Variables
	private double sideA;
	private double sideB;
	private double sideC;
	public final static String POLYGONSHAPE = "Triangle";
	public final static double DEFAULT_SIDE = 1.0;
	
	//Constructors
	public Triangle()
	{
		sideA = DEFAULT_SIDE;
		sideB = DEFAULT_SIDE;
		sideC = DEFAULT_SIDE;
	}
	public Triangle(double a, double b, double c)
	{
		if (Triangle.isTriangle(a, b, c))
		{
			sideA = a;
			sideB = b;
			sideC = c;
		}
		else
		{
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
	}
	public Triangle(double[] side)
	{
		if(Triangle.isTriangle(side))
		{
			sideA = side[0];
			sideB = side[1];
			sideC = side[2];
		}
		else
		{
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
		
	}
	public Triangle(Triangle copy)
	{
		if ((copy != null) && Triangle.isTriangle(copy.sideA, copy.sideB, copy.sideC))
		{
			sideA = copy.sideA;
			sideB = copy.sideB;
			sideC = copy.sideC;
		}
		else
		{
			sideA = DEFAULT_SIDE;
			sideB = DEFAULT_SIDE;
			sideC = DEFAULT_SIDE;
		}
	}

	public double getSideA()
	{
		return this.sideA;
	}
	public double getSideB()
	{
		return this.sideB;
	}
	public double getSideC()
	{
		return this.sideC;
	}
	public double[] getSides()
	{
		double[] sides = new double[] {sideA, sideB, sideC};
		return sides;
	}
	// Angles
	public double getAngleA()
	{
		double angle = 0;
		angle = Triangle.lawOfCosines(this.sideB, this.sideC, this.sideA);
		return angle;
	}
	public double getAngleB()
	{
		double angle = 0;
		angle = Triangle.lawOfCosines(this.sideA, this.sideC, this.sideB);
		return angle;
	}
	public double getAngleC()
	{
		double angle = 0;
		angle = Triangle.lawOfCosines(this.sideA, this.sideB, this.sideC);
		return angle;
	}
	
	public double[] getAngles()
	{
		double[] angles = new double[3];
		//A
		double angleA = 0;
		angleA = Triangle.lawOfCosines(this.sideB, this.sideC, this.sideA);
		angles[0] = angleA;
		//b
		double angleB = 0;
		angleB = Triangle.lawOfCosines(this.sideA, this.sideC, this.sideB);
		angles[1] = angleB;
		//C
		double angleC = 0;
		angleC = Triangle.lawOfCosines(this.sideA, this.sideB, this.sideC);
		angles[2] = angleC;
		
		return angles;
	}

	public boolean setSideA(double a)
	{
		if (Triangle.isTriangle(a, this.sideB, this.sideC))
		{	this.sideA = a;
			return true;}
		else
			{return false;}
	}
	public boolean setSideB(double b)
	{
		if (Triangle.isTriangle(this.sideA, b, this.sideC))
		{	this.sideB = b;
			return true;}
	else
		{return false;}
	}
	public boolean setSideC(double c)
	{
		if (Triangle.isTriangle(this.sideA, this.sideB, c))
		{	this.sideC =c;
			return true;}
	else
		{return false;}
	}
	public boolean setSides(double[] sides)
	{
		if (Triangle.isTriangle(sides))
		{
			this.sideA = sides[0];
			this.sideB = sides[1];
			this.sideC = sides[2];
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static boolean isTriangle(double a, double b, double c)
	{
		if ((a+b<=c) || (b+c<=a) || (c+a<=b) || (a+b+c<3) || (a<=0) || (b<= 0) || (c<= 0))
		{return false;}
		else 
		{return true;}
	}
	public static boolean isTriangle(double[] sides)
	{
		if (sides == null)
			{return false;}
		else if (sides.length < 3)
			{return false;}
		else
		{
			double a = sides[0];
			double b = sides[1];
			double c = sides[2];
		
			if ((a+b<=c) || (b+c<=a) || (c+a<=b) || (a+b+c<3) || (a<=0) || (b<= 0) || (c<= 0))
			{return false;}
			else 
			{return true;}
		}
	}
	public static double lawOfCosines(double a, double b, double c)
	{
		double angC = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b));
		angC = angC * 180;
		angC = angC/Math.PI;
		return angC;
	}
	
	public String toString()
	{
		String a = String.format("%.4f", this.sideA);
		String b = String.format("%.4f", this.sideB);
		String c = String.format("%.4f", this.sideC);
		return POLYGONSHAPE + "(" + a + ", " + b + ", " + c + ")";
	}
}
