package lotr;

public class Elf extends Character{

    public Elf() {
        super(10, 10, new Elf_kick());
        
    }

    
    public String toString() {
        return getClass().getSimpleName()+"{hp="+getHp() + ", power=" + getPower() + "}";
    }
    
}
