

public class EmailStrategy implements NotificationStrategy{
    @Override
    public void sendNotification(String msg){
        System.out.println("Sending Email: "+msg);
    }
}