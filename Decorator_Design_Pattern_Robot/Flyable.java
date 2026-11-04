public class Flyable extends Decorator{


  

    public Flyable(IRobot robo){
        super(robo);
    }

    @Override
    public String action(){
        return super.action()+" Flyable";
    }

}