


public class PushStratergy implements NotificationStrategy{
    @Override
    public void sendNotification(String msg){
        System.out.println("Sending push notify: "+msg);
    }
}