

public class Decorator implements ICharacter{
   
    protected ICharacter character;

public Decorator(ICharacter character) {
    this.character = character;
}
    
    @Override
    public String getAbilities(){
        return character.getAbilities();
    }
}

