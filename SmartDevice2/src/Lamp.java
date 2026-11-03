public class Lamp extends SmartDevice {
    int brightness;
    int maxBrightness;

    Lamp(boolean status, int maxBrightness) {
        super(status);
        this.maxBrightness = maxBrightness;
    }

    public void changeBr (int newBrightness) {
        if (status) {
            if (newBrightness > maxBrightness) {
                System.out.println("Установленная яркость превышает максимальную.");
            }
            else {
                this.brightness = newBrightness;
                System.out.println("Установлена яркость: " + newBrightness);
            }
        }

        else {
            System.out.println("Пожалуйста, включите лампу.");
        }
    }
}