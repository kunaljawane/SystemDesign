public class TVOnCommand implements ICommand{
    
    Television tv = new Television();

    public TVOnCommand(Television tv){
        this.tv=tv;
    }


    @Override
    public void execute(){
        tv.on();
    }
}