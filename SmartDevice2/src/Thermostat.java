public class Thermostat extends SmartDevice {
    int temperature;
    int celTemperature;

    Thermostat(boolean status, int temperature, int celTemperature) {
        super(status);
        this.temperature = temperature;
        this.celTemperature = celTemperature;
    }

    public void setTemperature (int celTemperature) {
        if (celTemperature > 40 || celTemperature < 5) {
            System.out.println("Установленная температура не соответствует возможной");
        }

        else {
            if (celTemperature > temperature) {
                System.out.printf("Произошёл нагрев до %d градусов%n", celTemperature);
            }

            if (celTemperature < temperature) {
                System.out.printf("Произошло охлаждение до %d градусов%n", celTemperature);
            }

            this.temperature = celTemperature;
        }
    }
}