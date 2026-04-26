package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class RemoteControl {
    private Command command;
    public void setCommand(Command command){
        this.command=command;
    }

    public void pressButton(){
        command.execute();
    }
}
