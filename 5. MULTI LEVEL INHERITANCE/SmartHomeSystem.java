class Device {
    protected String name;
    protected boolean powerStatus;

    public Device(String name, boolean powerStatus) {
        this.name = name;
        this.powerStatus = powerStatus;
    }

    public void togglePower() {
        powerStatus = !powerStatus;
        System.out.println(name + " is now " + (powerStatus ? "ON" : "OFF"));
    }
}

class SmartDevice extends Device {
    protected String connectivity;

    public SmartDevice(String name, boolean powerStatus, String connectivity) {
        super(name, powerStatus);
        this.connectivity = connectivity;
    }

    public void connect() {
        System.out.println(name + " is connected via " + connectivity);
    }
}

class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String name, boolean powerStatus, String connectivity, int brightness) {
        super(name, powerStatus, connectivity);
        this.brightness = brightness;
    }

    public void adjustBrightness(int level) {
        brightness = level;
        System.out.println(name + " brightness set to " + brightness + "%");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight("Living Room Light", false, "WiFi", 50);
        livingRoomLight.togglePower();
        livingRoomLight.connect();
        livingRoomLight.adjustBrightness(75);
    }
}