public class Main {

    public static void main(String[] args) {

        // Create notification
        INotification notification =
                new SimpleNotification("Your payment was successful!");

        // Apply decorators
        notification = new TimeDecorator(notification);
        notification = new SignatureDecorator(notification);

        // Create observers
        NotificationPublisher publisher =
                new NotificationPublisher();

        publisher.addObserver(new Logger());
        publisher.addObserver(new NotificationLogger());

        // Create service
        NotificationService service =
                new NotificationService(publisher);

        // Select strategy
        service.setStratergy(new EmailStrategy());

        // Send notification
        service.sendNotification(notification);

        System.out.println("\n--- Switching Strategy ---");

        service.setStratergy(new SMStratergy());

        service.sendNotification(notification);
    }
}