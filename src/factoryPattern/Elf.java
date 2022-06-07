package factoryPattern;

public class Elf extends Heroes {

    int AttackSpeed;
    public Elf(String name, int hp, int armor, int power, int speed, int attackSpeed) {
        super(name, hp, armor, power, speed);
        this.AttackSpeed = attackSpeed;
    }
}

