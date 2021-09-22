package git_Object;

public class git_Object2 {
	
	private String productID;
	private String productName;
	private int price;
	private double tax;
	
	public git_Object2() {
		
	}
	
	public git_Object2(String productID, String productName, int price, double tax) {
		this.productID = productID;
		this.productName =productName;
		this.price = price;
		this.tax =tax;
	}
	
	public String getproductID() {
		return productID;
	}
	public void setproductID (String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String information() {
		return productID + "\t" + productName + "\t" + price + "\t" + tax;
	}
}
	
