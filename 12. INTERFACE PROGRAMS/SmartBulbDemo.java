interface PowerSwitch {
    void turnOn();
    void turnOff();
}

interface Dimmer {
    void dim(int level);
}

class SmartBulb implements PowerSwitch, Dimmer {
    boolean isOn = false;
    int brightness = 0;

    public void turnOn() {
        isOn = true;
        brightness = 50;
        System.out.println("Bulb turned ON at brightness " + brightness);
    }

    public void turnOff() {
        isOn = false;
        brightness = 0;
        System.out.println("Bulb turned OFF");
    }

    public void dim(int level) {
        if (!isOn) {
            System.out.println("Bulb is off. Cannot dim.");
            return;
        }
        if (level >= 0 && level <= 100) {
            brightness = level;
            System.out.println("Brightness set to " + brightness);
        } else {
            System.out.println("Invalid brightness level.");
        }
    }
}

public class SmartBulbDemo {
    public static void main(String[] args) {
        SmartBulb bulb = new SmartBulb();
        bulb.turnOn();
        bulb.dim(80);
        bulb.dim(150);
        bulb.turnOff();
    }
}