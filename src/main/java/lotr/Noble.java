package lotr;

import java.util.Random;


public abstract class Noble extends Character{
    
    public Noble(int min, int max, KickStrategy strategy){
        
        super(new Random().nextInt(max - min) + min + 1, new Random().nextInt(max - min) + min + 1, strategy);
    }

}
