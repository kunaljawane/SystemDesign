

public static void main(String[] args){
     ICharacter mario = new Mario();

        mario = new HeightUp(new GunPower(mario));
       // mario = new GunPower(mario);
       // mario = new StarPower(mario);

        System.out.println(mario.getAbilities());
}