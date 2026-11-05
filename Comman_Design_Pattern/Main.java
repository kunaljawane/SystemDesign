public class Main {

    public static void main(String[] args) {

        Television tv = new Television();

        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TVOnCommand(tv));
        remote.pressButton();

        remote.setCommand(new TVOffCommand(tv));
        remote.pressButton();
    }
}