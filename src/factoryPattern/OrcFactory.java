package factoryPattern;

import java.util.Random;

public class OrcFactory implements Factory{
    Random random = new Random();
    int OrcID = random.nextInt(10);
    int OrcHp = random.nextInt(80,100);
    int OrcArmor = random.nextInt(20);
    int OrcPower = random.nextInt(5,15);
    int OrcSpeed = random.nextInt(15,20);
    int OrcRage = random.nextInt(50,100);
    @Override
    public void makeHeroes(){
        Orc orc = new Orc("Orc"+OrcID, OrcHp, OrcArmor, OrcPower, OrcSpeed, OrcRage);
        System.out.println("Создан персонаж представителей Орка!");
        System.out.println("Имя: "+orc.name + " HP: "+OrcHp + " Armor:"+OrcArmor+ " Power: "+OrcPower+ " Speed: "+OrcSpeed+ " Rage: "+OrcRage);
    }
}
