public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount;

    public Cat() {
        this(3000, "Barsik", 1, "Grey");
    }

    public Cat(double weight, String name, int age, String color) {
        this.weight=weight;
        this.name=name;
        this.age=age;
        this.color=color;
        catCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > this.age)
            this.age = age;
    }

    public String getColor() {
        return color;
    }
    //метод только для садистов
    public void setColor(String color) {
        this.color = color;
        //и так жалобно
        meow(); meow(); meow();
    }

    void meow() {
        System.out.println("meow");
    }

    private void pee() {
        weight-=20;
    }

    void eat() {
        weight+=50;

        if (50 / weight > .01)
            pee();
    }


}
