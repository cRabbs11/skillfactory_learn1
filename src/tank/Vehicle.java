package tank;

abstract public class Vehicle {

    public Vehicle(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected int posX;
    protected int posY;
    protected int direction;

    abstract void goForward(int position);
    abstract void goBackward(int position);

    @Override
    public String toString() {
        return "Vehicle{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direction=" + direction +
                '}';
    }
}
