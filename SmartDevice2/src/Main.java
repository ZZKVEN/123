import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(false, 100);
        lamp.changeBr(75);
        lamp.getStatus();
        lamp.setStatus(true);
        lamp.changeBr(75);
        lamp.setStatus(false);

        System.out.println("-------------------");

        Thermostat thermostat = new Thermostat(true, 0, 20);
        thermostat.setTemperature(20);
        thermostat.setTemperature(15);
        thermostat.setTemperature(2);

        System.out.println("-------------------");

        Blinds blinds = new Blinds(false, 0, 180);
        blinds.setCorner(50);
        blinds.setStatus(true);
        blinds.setCorner(50);

        System.out.println("-------------------");

        List<SmartDevice> list = new ArrayList<>();
        list.add(lamp);
        list.add(thermostat);
        list.add(blinds);

        for (SmartDevice s : list) {
            s.getStatus();
        }
    }
}