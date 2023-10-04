package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("|----- Battle begins! -----|");
        System.out.println(c1.getClass().getSimpleName() + " against " + c2.getClass().getSimpleName());
        
        if (c1 instanceof Hobbit && c2 instanceof Hobbit){
            System.out.println("|----- The battle was over before it had even begun :'( -----|");
            return;
        }

        while (c1.isAlive() && c2.isAlive()) {
            attack(c1,c2);
            
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " is defeated!");
                break;
            }
            attack(c2, c1);

            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " is defeated!");
                break;
            }
        }

        System.out.println("|----- Battle ends! -----|");
        if (c1.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " wins!");
        } else if (c2.isAlive()) {
            System.out.println(c2.getClass().getSimpleName() + " wins!");
        }
    }
    
    public static void attack(Character c1, Character c2){
        System.out.println(c1.getClass().getSimpleName() + " attacks!");
        c1.kick(c2);
        System.out.println(c2.getClass().getSimpleName() + " HP: " + c2.getHp());
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();

        fight(c1, c2);
    }
}
