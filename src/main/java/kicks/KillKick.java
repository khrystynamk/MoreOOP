package kicks;

import lotr.Character;

public class KillKick implements KickStrategy{
    public void kick(Character whoKick, Character opponent){
        if (opponent.getPower() < whoKick.getPower()){
            opponent.setHp(0);
        }
        else{
            opponent.setHp(opponent.getHp() - 1);
        }
    }
}
