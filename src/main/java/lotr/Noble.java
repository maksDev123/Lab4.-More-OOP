package lotr;

import java.util.Random;


public abstract class Noble extends Character{
    private static Random rand = new Random();
    
    
    public Noble(int min, int max, KickStrategy strategy){
        
        super(rand.nextInt(max - min) + min + 1, rand.nextInt(max - min) + min + 1, strategy);
    }

}
