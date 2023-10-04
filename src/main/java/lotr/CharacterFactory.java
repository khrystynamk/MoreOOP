package lotr;
import java.util.Random;
import java.lang.reflect.Constructor;
import lombok.SneakyThrows;

public class CharacterFactory {
    private static final Class<?>[] CHARACTERS = {King.class, Knight.class, Hobbit.class, Elf.class};
    
    @SneakyThrows
    public static Character createCharacter() {
        int randomIndex = new Random().nextInt(CHARACTERS.length);
        Constructor<?> constructor = CHARACTERS[randomIndex].getConstructor();
        return (Character) constructor.newInstance();
    }
}
