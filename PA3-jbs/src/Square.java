
public class Square extends Object {

	public static String name = "square";
	public static Center center;
	public int length;
	
	public Square(Center center, int length){
		
		this.center = center;
		this.length = length;
	}
	
	public String getPosition(){
		
		return ("(" + center.x + ", " + center.y + ")");
	}
}
