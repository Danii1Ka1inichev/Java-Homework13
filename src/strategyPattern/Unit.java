package strategyPattern;

public class Unit{
    String name;
    int hp;
    int speed;
    int power;
    int armor;

    Unit(String name, int hp, int speed, int power, int armor){
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.power = power;
        this.armor = armor;
    }
}