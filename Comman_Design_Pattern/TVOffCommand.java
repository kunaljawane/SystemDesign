public class TVOffCommand implements ICommand{

    Television tv = new Television();

    public TVOffCommand(Television tv){
        this.tv=tv;
    }

    @Override
    public void execute(){
        tv.off();
    }
}