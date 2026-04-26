package org.example.Behavioural.Command.WithCommand;

import org.example.Behavioural.Command.Devices.Fan;
import org.example.Behavioural.Command.WithCommand.Interface.Command;

public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}
