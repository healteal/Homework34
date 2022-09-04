public class ShipAll extends Ship implements Runnable {
    public ShipAll(String name, int storage, Port port) {
        super(name, storage, port);
    }

    @Override
    public void run() {
        while (true) {
            int random = (int) (Math.random() * 100);
            if (random % 2 == 0) {
                port.getFromPort(this);
            } else {
                port.putInPort(this);
            }
        }
    }
}
