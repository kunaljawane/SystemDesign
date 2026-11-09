class Logger implements IObserver{

    @Override
    public void update(String msg){
        System.out.println("Logger: "+msg);
    }
}