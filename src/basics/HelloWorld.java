/*


package basics;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		//	System.out.println("Hello World");
		Order order = new Order().createOrder();
		if(order.getTimeStamp() != null)
			System.out.println(order.getTimeStamp().getCreatedAt());
		//order.createOrder();
	}




}

class Order{

	private String orderId;
	private TimeStamp timeStamp;

	public Order createOrder() {
		Order order = new Order();
		TimeStamp stamp = new TimeStamp();
		stamp.getCreatedAt();
		stamp.getUpdatedAt();
		order.setOrderId("NIM0928A");
		order.setTimeStamp(stamp);
		return order;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public TimeStamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(TimeStamp timeStamp) {
		this.timeStamp = timeStamp;
	}



}

class TimeStamp{

	//instance variable ->(scope in whole class & no initialization required)
	private static Date createdAt;
	private Date updatedAt;

	public Date getCreatedAt() {
		System.out.println(createdAt);
		return new Date();
	}

	public Date getUpdatedAt() {
		return new Date();
	}

	public void he(String localVariableString) {
		// local variable -> scope in that method only & mandatory to initialize
		int createdAt1=1;
		System.out.println(createdAt1);

	}

	public static void instanceObject() {
		createdAt = new Date();
	}

}

class Tracking{
	private static String trackingId;
	private TimeStamp timeStamp;

	public static void instanceObject() {
		Tracking.trackingId = "asd";
	}
}

*/
