
public interface IChannel{

    public void subscribe(ISubscriber subscriber);

    public void unsubscribe(ISubscriber subscriber);

    public void notifyAll(String videoName);


}