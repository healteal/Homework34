public class ShipGetter extends Ship implements Runnable {
    public ShipGetter(String name, int storage, Port port) {
        super(name, storage, port);
    }

    @Override
    public void run() {
        while (true) {
            port.getFromPort(this);
        }
    }
}
