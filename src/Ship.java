public class Ship {
    private final String name;
    private int storage;
    Port port;

    public Ship(String name, int storage, Port port) {
        this.name = name;
        this.storage = storage;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
