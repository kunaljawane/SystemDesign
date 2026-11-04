public static void main(String[] args){
     IRobot Robot = new Robot();

        Robot = new Walkable(new Talkable(Robot));
       // mario = new GunPower(mario);
       // mario = new StarPower(mario);

        System.out.println(Robot.action());
}