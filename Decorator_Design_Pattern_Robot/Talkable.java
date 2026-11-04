public class Talkable extends Decorator{


  

    public Talkable(IRobot robo){
        super(robo);
    }

    @Override
    public String action(){
        return super.action()+" Talkable";
    }

}