package kicks;

import lotr.Character;
import lotr.Noble;

public class NobleKick implements KickStrategy{
    public void kick(Character whoKick, Character opponent){
        int decreaseHp = ((Noble) whoKick).random();
        opponent.setHp(opponent.getHp() - decreaseHp);
    }
}

