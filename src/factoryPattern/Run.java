package factoryPattern;

public class Run {
    public static void main(String[] args) {
        HumanFactory hf = new HumanFactory();
        OrcFactory of = new OrcFactory();
        ElfFactory ef = new ElfFactory();

        hf.makeHeroes();
        System.out.println();
        of.makeHeroes();
        System.out.println();
        ef.makeHeroes();
    }
}