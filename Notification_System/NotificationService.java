

public class NotificationService{
    public NotificationPublisher notificationPublisher;
    public NotificationStrategy notificationStrategy;

    NotificationService(NotificationPublisher notificationPublisher) {
        this.notificationPublisher = notificationPublisher;
    }

    public void setStratergy(NotificationStrategy notificationStrategy){
        this.notificationStrategy = notificationStrategy;
    }

    public void sendNotification(INotification notification){
        if(notificationStrategy == null){
            throw new IllegalStateException("Stragergy not selected");
        }

        String msg = notification.getContent();
        
        notificationStrategy.sendNotification(msg);

        notificationPublisher.notifyAll(msg);

        
    }
}