

public class SimpleNotification implements  INotification{

    public String content;

    public SimpleNotification(String content){
        this.content=content;
    }

    @Override
    public String getContent(){
        return content;
    }
}