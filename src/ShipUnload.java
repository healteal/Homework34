public class ShipUnload extends Ship implements Runnable {

    public ShipUnload(String name, int storage, Port port) {
        super(name, storage, port);
    }

    @Override
    public void run() {
        while (true) {
            port.putInPort(this);
        }
    }
}
