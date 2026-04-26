package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.Devices.Fan;
import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class FanOnCommand implements Command{
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }
}
