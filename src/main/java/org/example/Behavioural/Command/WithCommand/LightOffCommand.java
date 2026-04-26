package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.Devices.Light;
import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute(){
        light.turnOff();
    }
}
