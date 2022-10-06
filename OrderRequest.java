package PizzaPastaOrdering;

public class OrderRequest {
	private int menuItemNumber;
	private int qty;
	private int oId;
	private boolean status;
	private int bill;
	
	
	
	public OrderRequest(boolean status) {
		
		this.status = status;
	}

	public int getFinalBill(int price,int qty) {
		System.out.println("Price for 1 unit of above item will be - "+price);
		System.out.println("Total price will be - "+price*qty);
		return (price*qty);
	}

	public int getMenuItemNumber() {
		return menuItemNumber;
	}



	public void setMenuItemNumber(int menuItemNumber) {
		this.menuItemNumber = menuItemNumber;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}

	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public int getBill() {
		return bill;
	}



	public void setBill(int bill) {
		this.bill = bill;
	}



	public OrderRequest() {
		
	}
}
