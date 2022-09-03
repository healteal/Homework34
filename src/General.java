public class General {
    public static void main(String[] args) {
        Port port = new Port();
        ShipGetter shipGetter = new ShipGetter("Титаник", 0, port);
        ShipUnload shipUnload = new ShipUnload("Ситаник", 10, port);
        Thread thread1 = new Thread(shipGetter);
        thread1.setDaemon(true);
        thread1.start();
        Thread thread2 = new Thread(shipUnload);
        thread2.setDaemon(true);
        thread2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
