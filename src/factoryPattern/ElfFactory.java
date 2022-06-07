package factoryPattern;

import java.util.Random;

public class ElfFactory implements Factory {
    Random random = new Random();
    int ElfID = random.nextInt(10);
    int ElfHp = random.nextInt(80,100);
    int ElfArmor = random.nextInt(20);
    int ElfPower = random.nextInt(5,15);
    int ElfSpeed = random.nextInt(15,20);
    int ElfAttackSpeed = random.nextInt(50,100);
    @Override
    public void makeHeroes() {
        Elf elf = new Elf("Elf"+ElfID, ElfHp, ElfArmor, ElfPower, ElfSpeed, ElfAttackSpeed);
        System.out.println("Создан персонаж представителей Елфов!");
        System.out.println("Имя: "+elf.name + " HP: "+ElfHp + " Armor:"+ElfArmor+ " Power: "+ElfPower+ " Speed: "+ElfSpeed+ " AttackSpeed "+ElfAttackSpeed);
    }
}