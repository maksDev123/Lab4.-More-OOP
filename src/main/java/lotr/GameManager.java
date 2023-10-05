package lotr;

public class GameManager {
    public void fight(Character first, Character second){
        if (first instanceof Hobbit && second instanceof Hobbit){
            return;
        }
        while (first.getHp() > 0 && second.getHp() > 0 ){
            first.kick(second);
            if (second.getHp() > 0){
                second.kick(first);
            }
        } 
        return;
    }
}
