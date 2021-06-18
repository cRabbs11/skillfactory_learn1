public class Red {

    String name;
    int health;
    int strength;
    boolean status = true;

    Red(int health, int strengh) {
        this.health = health;
        this.strength = strengh;
    }

    public void recievePunch(int strength) {
        health = health - strength;
        if (health <= 0) {
            status = false;
        }
    }
}
