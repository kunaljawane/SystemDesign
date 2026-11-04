import java.util.*;

public class Channel implements IChannel{

    ArrayList<ISubscriber> list = new ArrayList<>();

    @Override 
    public void subscribe(ISubscriber subscriber){
        list.add(subscriber);
        System.out.println("Subscriber Added");
    }

    @Override
    public void unsubscribe(ISubscriber subscriber){
        list.remove(subscriber);
        System.out.println("Subscriber Removed");
    }

    @Override
    public void notifyAll(String videoName){
        for(ISubscriber subscriber: list){
            subscriber.update(videoName);
        }
    }

    public void uploadVideo(String videoName){
        System.out.println("New video uploaded");
        notifyAll(videoName);
    }


}