package lotr;

import java.util.Random;

public class NobleKick implements KickStrategy{
     private static Random rand = new Random();
    @Override
    public void kick(Character whoKick, Character opponent) {
            opponent.setHp(opponent.getHp() - rand.nextInt(whoKick.getPower()));
        
    }
    
}
