import javax.swing.ImageIcon;


public abstract class Item 
{
	/**
	 *  This class will be extended by all other item classifications (e.g. Beverage class
	 *  extends Item class),  I'm thinking this may be the root class in the hierarchy, but
	 *  these decisions may be decided on a later time.  Just getting started on this 
	 *  example class to get everyone brainstorming.
	 *  
	 *  @author Kevin Ruiz
	 */
	private String name;
	private int quantity;
	private double price = 0.0;
	private ImageIcon preview;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public ImageIcon getPreview() {
		return preview;
	}
	public void setPreview(ImageIcon preview) {
		this.preview = preview;
	}
	
}
