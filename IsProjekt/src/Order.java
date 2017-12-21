
	import java.util.ArrayList;


public class Order {
		
	private String orderID;
	private String deliveryDate;
	private String owner;

	ArrayList<OrderRow> orderRowsMap = new ArrayList<>();

	public Order(String orderID) {
		setOrderID(orderID);
		
	}
	
	public void setOrderID(String orderID) {
		this.orderID=orderID;
	}
	
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOrderID() {
		return orderID;
	}
	
	public String getDeliveryDate() {
		return deliveryDate;
	}
	
	public String getOwner() {
		return owner;
	}
	public OrderRow addOrderRow(OrderRow orderRow) {
		if (!orderRowsMap.contains(orderRow)) {
			orderRowsMap.add(orderRow);
			return orderRow;
		}
		else {
			return null;
		}
	}

}
