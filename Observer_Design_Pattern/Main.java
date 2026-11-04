public class Main {

    public static void main(String[] args) {

        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Kunal");
        Subscriber s2 = new Subscriber("Rahul");
        Subscriber s3 = new Subscriber("Amit");

        // Subscribe
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        // Upload video
        channel.uploadVideo("Observer Design Pattern");

        // Unsubscribe
        channel.unsubscribe(s2);

        // Upload another video
        channel.uploadVideo("Singleton Design Pattern");
    }
}