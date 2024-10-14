package airConditioner;

import java.util.Locale;

public class AirConditioner {
    public String acSwitch(String isOn){
        if (isOn.equalsIgnoreCase("On")){
            return isOn.toLowerCase();
        }
        return "Off";
    }

    public void increaseAcTemperature(String plus){

    }
}
