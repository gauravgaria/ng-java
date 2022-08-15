
package basics;

import java.util.Date;

public class test {
    public static void main(String[] args){
        TimeStamp t= new TimeStamp();
        Order order = new Order().createOrder();
        Account acc = new Account();
        if(order.getTimeStamp() != null )
            System.out.println(order.getTimeStamp().getCreatedAt());
        System.out.println(Tracking.instanceObject());
        System.out.println(t.he("nimesh"));
        System.out.println(acc.Accountdetails());
        System.out.println(acc.a().he("qw"));

    }
}
     class Order{
        private String orderId;
        private TimeStamp timeStamp;

        public Order createOrder(){
            Order order = new Order();
            TimeStamp stamp = new TimeStamp();
            stamp.getCreatedAt();
            stamp.getUpdatedAt();
            order.setOrderId("QWE12");
            order.setTimeStamp(stamp);
            return order;
        }
        public String getOrderId(){
            return orderId;
        }
        public void setOrderId(String orderId){
            this.orderId = orderId;
        }
        public TimeStamp getTimeStamp(){
            return timeStamp;
        }
        public void setTimeStamp(TimeStamp timeStamp){
            this.timeStamp = timeStamp;
        }
    }

    class TimeStamp{
        private static Date createdAt;
        private Date updatedAt;

        public Date getCreatedAt() {
            System.out.println(createdAt);
            return new Date();
        }
        public Date getUpdatedAt(){
            return new Date();
        }
        public static int he(String localVariableString){
            int createAt1 = 1;
            return createAt1 ;

        }
        public static void instanceObject(){
            createdAt = new Date();
        }
    }
    class Tracking{
        private static String trackingId;
        private TimeStamp timeStamp;

        public static String instanceObject(){
            Tracking.trackingId = "asd";
            return trackingId;
        }
    }

    class Account{
    private String email;
    private TimeStamp timeStamp;

    public TimeStamp a(){
        return timeStamp;
    }
    public TimeStamp geta(){
        return timeStamp;
    }
    public void seta(TimeStamp timeStamp){
        this.timeStamp = timeStamp;
    }
    public String Accountdetails(){
        return "n.g@gmail.com";
    }


    }

