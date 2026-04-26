package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class BetterRemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public BetterRemoteControl(int size){
        onCommands=new Command[size];
        offCommands=new Command[size];
    }

    public void setCommands(int slot,Command On,Command Off){
        onCommands[slot]=On;
        offCommands[slot]=Off;
    }

    public void pressOn(int slot){
        onCommands[slot].execute();
    }

    public void pressOff(int slot){
        offCommands[slot].execute();
    }
}
