

abstract  class NotificationDecorator implements INotification{

    public INotification notification;

    public NotificationDecorator(INotification notification){
        this.notification=notification;
    }

    
}