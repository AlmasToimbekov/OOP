package main.java.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        LightOnCommand cichenLightOn = new LightOnCommand(light);
        LightOffCommand cichenLightOff = new LightOffCommand(light);

        remote.onCommands[0] = cichenLightOn;
        remote.offCommands[0] = cichenLightOff;

        System.out.println(remote.toString());

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
    }
}
