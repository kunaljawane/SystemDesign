public class StarPower extends Decorator{

     public StarPower(ICharacter character) {
        super(character);
    }

    @Override
    public String getAbilities(){
        return super.getAbilities()+" with star power";
    }
}