public class Blinds extends SmartDevice {
    int corner;
    int maxCorner;

    Blinds(boolean status, int corner, int maxCorner) {
        super(status);
        this.corner = corner;
        this.maxCorner = maxCorner;
    }

    public void setCorner (int corner) {
        if (!status) {
            System.out.println("Откройте жалюзи");
        }
        else {
            this.corner = corner;
            System.out.printf("Установлен угол %d %n", corner);
        }
    }
}
