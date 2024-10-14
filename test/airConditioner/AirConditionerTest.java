package airConditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void newAc_acIsOnTest(){
        AirConditioner airConditioner = new AirConditioner();
        String isAcOn = airConditioner.acSwitch("On");
        assertEquals("on", isAcOn);
    }

    @Test
    public void newAc_acIsOffTest(){
        AirConditioner airConditioner = new AirConditioner();
        String isAcOff = airConditioner.acSwitch("Off");
        assertEquals("Off", isAcOff);
    }

    @Test
    public void newAc_acTemperatureIsIncreaseTest(){
        AirConditioner airConditioner = new AirConditioner();
//        airConditioner.increaseAcTemperature();
    }
}
