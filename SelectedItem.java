public class SelectedItem implements Item {

	private int itemNumber;
	private String description;
	private double unitPrice;
	private int quantity;
	
	public SelectedItem(int itemNumber, String description,
			double unitPrice, int quantity) {
		this.itemNumber = itemNumber;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int newQuantity) {
		quantity = newQuantity;
	}
	
}