
public class Disc extends Object{

	public static String name = "disk";
	public Center center;
	public int diameter;
	
	public Disc(Center center, int diameter){
		
		this.center = center;
		this.diameter = diameter;
	}
	
	public String getPosition(){
		
		return ("(" + center.x + ", " + center.y + ")");
	}
}
