package tank;

public class AddSupplyException extends Exception {
    int detail;
    public AddSupplyException(int detail, String message) {
        super(message);
        this.detail=detail;
    }

    @Override
    public String toString() {
        return "tank.AddSupplyException{" +
                "detail=" + detail +
                "message" + getMessage() +
                '}';
    }
}
