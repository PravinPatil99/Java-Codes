package oops.com.pravi.Blc1;

public class InventoryItem 
{
	private String itemName;
	private double pricePerUnitUnit;
	private int    quantityInStock;
	
	public InventoryItem(String itemName, double pricePerUnitUnit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnitUnit = pricePerUnitUnit;
		this.quantityInStock = quantityInStock;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerUnitUnit() {
		return pricePerUnitUnit;
	}

	public void setPricePerUnitUnit(double pricePerUnitUnit) {
		this.pricePerUnitUnit = pricePerUnitUnit;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
		public void calculateTOtalValue()
		{
			
	}
	
	
	

}
