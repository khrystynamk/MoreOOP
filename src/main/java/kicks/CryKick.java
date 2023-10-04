package kicks;

import lotr.Character;

public class CryKick implements KickStrategy{
    public void kick(Character whoKick, Character opponent){
        System.out.println(":'(");
    }
}
