package tdd;

public class JunitTesting {
	
	public double distance(double x1,double y1, double x2,double y2)
	{
		double dis;
		
		dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return dis;
	}
	
	public double gradient(double x1, double y1,
	                       double x2, double y2)
	{
		double grad;
		
		grad=(y2 - y1) / (x2 - x1);
	        return grad;
	 }
	
	
	public double equation(double x1, double y1,double x2, double y2)
	{
		double gradient1;

		gradient1=(y2 - y1) / (x2 - x1);
		double b = y1-gradient1*x1;
		double x=1;
		double y=gradient1*x+b;
		return y;
	}
}
