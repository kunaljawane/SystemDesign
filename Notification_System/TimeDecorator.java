
import java.util.Date;

public class TimeDecorator extends NotificationDecorator{

    public TimeDecorator(INotification notification){
        super(notification);
    }
    
    public String getContent(){
         return notification.getContent()
                + " | Time: " + new Date();
    }

}