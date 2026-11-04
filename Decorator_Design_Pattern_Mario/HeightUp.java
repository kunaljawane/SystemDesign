public class HeightUp extends Decorator{

    public HeightUp(ICharacter character) {
        super(character);
    }
    @Override
    public String getAbilities(){
        return super.getAbilities()+" with Height up";
    }
    
}