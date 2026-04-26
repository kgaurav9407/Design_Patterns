package org.example.Behavioural.Command.WithoutCommand;

import org.example.Behavioural.Command.Devices.AC;
import org.example.Behavioural.Command.Devices.Fan;
import org.example.Behavioural.Command.Devices.Light;

public class WithoutCommandRemoteControl {
    private Light light;
    private Fan fan;
    private AC ac;

    public WithoutCommandRemoteControl(Light light, Fan fan,AC ac){
        this.light=light;
        this.fan=fan;
        this.ac=ac;
    }

    public void pressLightOn(){
        light.turnOn();
    }

    public void pressLightOff(){
        light.turnOff();
    }

    public void pressFanOn(){
        fan.start();
    }

    public void pressFanOff(){
        fan.stop();
    }

    public void pressAcOn(){
        ac.On();
    }

    public void pressAcOff(){
        ac.Off();
    }

}
