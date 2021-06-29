package tank;

public class MiddleTank extends Tank {

    @Override
    void goForward(int position) {
        int fuel = getRestFuelPath(position*2);
        move(position);
        spendFuel(fuel);
    }

    @Override
    void goBackward(int position) {
        this.goForward(-position);
    }
}
