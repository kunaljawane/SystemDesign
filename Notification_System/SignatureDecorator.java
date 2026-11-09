

public class SignatureDecorator extends NotificationDecorator{

    public SignatureDecorator(INotification notification){
        super(notification);
    }
    
    public String getContent(){
         return notification.getContent()+
                "Notify By - Smart Notify";
    }

}