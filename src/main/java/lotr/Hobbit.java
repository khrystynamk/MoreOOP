package lotr;

import kicks.CryKick;
import lombok.Getter;

@Getter
public class Hobbit extends Character{
    public Hobbit(){
        super(3, 0, new CryKick());
    }
}