package tank;

public class HeavyTank extends Tank {

    @Override
    void goForward(int position) {
        int fuel = getRestFuelPath(position*3);
        move(position);
        spendFuel(fuel);
    }

    @Override
    void goBackward(int position) {
        this.goForward(-position);
    }
}
