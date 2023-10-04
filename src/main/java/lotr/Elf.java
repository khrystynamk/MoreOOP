package lotr;

import kicks.KillKick;

public class Elf extends Character{
    public Elf(){
        super(10, 10, new KillKick());
    }
}
