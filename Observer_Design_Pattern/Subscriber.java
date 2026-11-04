

class Subscriber implements ISubscriber{


    private String name;

    public Subscriber(String name){
        this.name=name;
    }

    @Override
    public void update(String videoName){
        System.out.println(name+" Recived "+" "+videoName);

    }
}