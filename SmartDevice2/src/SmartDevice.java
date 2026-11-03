public abstract class SmartDevice {
    boolean status;

    SmartDevice (boolean status) {
        this.status = status;
    }

    public void getStatus () {
        if (status) {
            System.out.println("Состояние: вкл.");
        }
        else {
            System.out.println("Состояние: выкл.");
        }
    }

    public void setStatus (boolean status) {
        this.status = status;
    }
}