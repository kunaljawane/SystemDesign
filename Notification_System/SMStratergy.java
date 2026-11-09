public class SMStratergy implements NotificationStrategy{
    @Override
    public void sendNotification(String msg){
        System.out.println("Sending SMS v"+msg);
    }
}