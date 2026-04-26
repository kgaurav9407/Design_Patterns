package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.Devices.AC;
import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class AcOffCommand implements Command {
    private AC ac;

    public AcOffCommand(AC ac){
        this.ac=ac;
    }

    @Override
    public void execute(){
        ac.Off();
    }
}
