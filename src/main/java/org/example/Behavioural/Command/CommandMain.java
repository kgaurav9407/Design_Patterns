package org.example.Behavioural.Command;

import org.example.Behavioural.Command.Devices.AC;
import org.example.Behavioural.Command.Devices.Fan;
import org.example.Behavioural.Command.Devices.Light;
import org.example.Behavioural.Command.WithCommand.*;
import org.example.Behavioural.Command.WithCommand.Interface.Command;
import org.example.Behavioural.Command.WithoutCommand.WithoutCommandRemoteControl;

public class CommandMain {
    public static void main(String args[]){
        Light light=new Light();
        Fan fan=new Fan();
        AC ac=new AC();

        WithoutCommandRemoteControl remote=new WithoutCommandRemoteControl(light,fan,ac);

        System.out.println("Without Command\n");
        remote.pressLightOn();
        remote.pressFanOn();
        remote.pressAcOn();

        remote.pressLightOff();
        remote.pressFanOff();
        remote.pressAcOff();

        System.out.println("\nWith Command\n");

        Command lightOn=new LightOnCommand(light);
        Command fanOn=new FanOnCommand(fan);
        Command acOn=new AcOnCommand(ac);

        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.setCommand(fanOn);
        remoteControl.pressButton();

        remoteControl.setCommand(acOn);
        remoteControl.pressButton();

        System.out.println("\nBetter Remote Control\n");
        BetterRemoteControl betterRemoteControl=new BetterRemoteControl(3);

        betterRemoteControl.setCommands(0,lightOn,new LightOffCommand(light));
        betterRemoteControl.setCommands(1,fanOn,new FanOffCommand(fan));
        betterRemoteControl.setCommands(2,acOn,new AcOffCommand(ac));

        betterRemoteControl.pressOn(0);
        betterRemoteControl.pressOff(0);

        betterRemoteControl.pressOn(1);
        betterRemoteControl.pressOff(1);

        betterRemoteControl.pressOn(2);
        betterRemoteControl.pressOff(2);


    }
}
