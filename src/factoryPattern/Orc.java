package factoryPattern;

public class Orc extends Heroes {
    int Rage;
    public Orc(String name, int hp, int armor, int power, int speed, int rage) {
        super(name, hp, armor, power, speed);
        this.Rage = rage;
    }
}