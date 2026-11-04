

public class Walkable extends Decorator{


    

    public Walkable(IRobot robo){
        super(robo);
    }

    @Override
    public String action(){
        return super.action()+" walkable";
    }

}