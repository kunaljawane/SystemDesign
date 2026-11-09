class NotificationLogger implements IObserver{

    @Override
    public void update(String msg){
        System.out.println("Nofication Logger: "+msg);
    }
}