package lotr;
import java.util.Random;

import kicks.NobleKick;

public abstract class Noble extends Character{
    private static Random randomGenerator = new Random();
    protected int min;
    protected int max;

    public Noble(int min, int max){
        super(random(min, max), random(min, max), new NobleKick());
        this.min = min;
        this.max = max;
    }

    private static int random(int min ,int max) {
        return randomGenerator.nextInt(max - min) + min;
    }

    public int random() {
        return random(min, max);
    }
    
}
