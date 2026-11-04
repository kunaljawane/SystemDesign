public class GunPower extends Decorator{

    public GunPower(ICharacter character) {
        super(character);
    }

    @Override
    public String getAbilities(){
        return super.getAbilities()+" with gunpower";
    }
}