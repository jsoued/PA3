
public abstract class Object {
	
	public static String name = "object";
	public Center center;
	
	public String getPosition(){
		
		return ("(" + center.x + ", " + center.y + ")");
	}
}
