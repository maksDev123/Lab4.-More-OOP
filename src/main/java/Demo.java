import lotr.Elf;
import lotr.GameManager;
import lotr.Hobbit;
import lotr.King;
import lotr.Knight;

public class Demo {
    public static void main(String[] args) {
        GameManager manager = new GameManager();
        manager.fight(new Hobbit(), new Hobbit());
        manager.fight(new King(), new Hobbit());
        manager.fight(new Elf(), new Hobbit());
        manager.fight(new Elf(), new Knight());
        manager.fight(new King(), new Knight());

    }
}
