public class Port {
    private int size = 0;

    public synchronized void getFromPort(Ship ship) {
        if (size < 1 || ship.getStorage() >= 250) {
            try {
                wait();
                notify();
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        size--;
        ship.setStorage(ship.getStorage() + 1);
        System.out.println("На корабле " + ship.getName() + " " + ship.getStorage() + " груза, в порту осталось " + size);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();
    }

    public synchronized void putInPort(Ship ship) {
        int MAX_SIZE = 1000;
        if (size > MAX_SIZE || ship.getStorage() < 1) {
            try {
                wait();
                notify();
                return;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        size++;
        ship.setStorage(ship.getStorage() - 1);
        System.out.println("На корабле " + ship.getName() + " " + ship.getStorage() + " груза, в порту осталось " + size);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        notify();
    }
}
