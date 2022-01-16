package percobaan;

public class House {
    public static void main(String[] args) {
        TV tv = new TV("TV ");
        AC ac = new AC("AC ");
        Electronics lamp = new Electronics("Lamp");
        Electronics device = new Electronics();

        tv.activate();
        ac.activate();
        lamp.activate();
        device.activate();

        device.deactivate();
        lamp.deactivate();
        ac.deactivate();
        tv.deactivate();
    }
}
