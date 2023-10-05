package lotr;

import java.util.Random;

public class Knight extends Noble{
    static Random rnd = new Random();
    public Knight() {
        super(2, 12, new NobleKick());
    }
    
}
