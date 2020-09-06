package com.yxd.caller;


import com.yxd.commond.*;
import com.yxd.implementor.Light;
import com.yxd.implementor.Washer;
import org.junit.Test;

public class RemoteControlTest {
    @Test
    public void test(){
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Washer washer = new Washer();
        Commond lightOn = new LightOnCommond(light);
        Commond lightOff = new LightOffCommond(light);
        Commond washerOn = new WasherOnCommond(washer);
        Commond washerOff = new WasherOffCommond(washer);

        remoteControl.addCommon(1, lightOn, 1);
        remoteControl.addCommon(1, lightOff, 0);
        remoteControl.addCommon(3, washerOn, 1);
        remoteControl.addCommon(3, washerOff, 0);

        remoteControl.display();

        System.out.println("=========================");
        remoteControl.turnOn(3);
        remoteControl.turnOff(3);
        remoteControl.turnOn(1);
        remoteControl.undo();
    }
}
