package lotr;



public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0, new Cry());
    }
    public void toCry(){
        System.out.println("Cryiiing....");
    }

    // public String StirngtoString(){
    //     return "{}"

    // 
    public String toString() {
        return getClass().getSimpleName()+"{hp="+getHp() + ", power=" + getPower() + "}";
    }
    
}
