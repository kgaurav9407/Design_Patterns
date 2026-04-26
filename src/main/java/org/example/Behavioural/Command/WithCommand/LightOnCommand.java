package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.Devices.Light;
import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.turnOn();
    }
}
