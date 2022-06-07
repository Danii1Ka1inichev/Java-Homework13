package factoryPattern;

public class Human extends Heroes{
    int Mp;
    public Human(String name, int hp, int armor, int power, int speed, int mp) {
        super(name, hp, armor, power, speed);
        this.Mp = mp;
    }
}
