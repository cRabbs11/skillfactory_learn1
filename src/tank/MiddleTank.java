package tank;

public class MiddleTank extends Tank implements Camouflagable {

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

    @Override
    public void setCamouflage(boolean value) {
        String camouflage = "camouflage is turned off";
        if (value) {
            camouflage = "camouflage is turned on";
        }
        System.out.println(camouflage);
    }
}
