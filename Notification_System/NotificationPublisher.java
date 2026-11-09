
import java.util.ArrayList;

class NotificationPublisher{
    ArrayList<IObserver> list = new ArrayList<>();

    public void addObserver(IObserver obs){
        list.add(obs);
    }

    public void removeObserver(IObserver obs){
        list.remove(obs);
    }

    public void notifyAll(String msg){
        for(IObserver obs : list){
            obs.update(msg);
        }
    }
}