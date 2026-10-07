package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Charjabug extends Grubbin {
    public Charjabug(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);
        this.addMove(new Crunch());
    }
}
