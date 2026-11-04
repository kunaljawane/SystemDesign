
public class Decorator implements IRobot{

    protected IRobot robo; 

    public Decorator(IRobot robo){
        this.robo=robo;
    }
    
    @Override
    public String action(){
        return robo.action();
    }
}