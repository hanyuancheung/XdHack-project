
public class Result {

	//"location":{"left":1508.66,"top":589,"width":74,"height":64,"rotation":-2},
	private Location location;
	private String beauty;
	public String getBeauty() {
		return beauty;
	}
	public void setBeauty(String beauty) {
		this.beauty=beauty;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location=location;
	}
}


/**
 * @author TANGNAN
 *
 */
class Location{
	public String left;
	public String top;
	public String width;
	public String height;
	
	public String getLeft() {
		return left;
	}
	
	public void setLeft(String left) {
		this.left = left;
	}
	
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top=top;
	}
	
	public String getWidth() {
		return width;
	}
	
	public void setWidth(String width) {
		this.width=width;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
		this.height=height;
	}
	
	public String toString() {
		return "Location[left=" +left+",top=" +top+",width="+width+",height="+height+"]";
	}
	
}