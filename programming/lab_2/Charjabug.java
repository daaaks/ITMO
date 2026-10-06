package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Charjabug extends Pokemon {
    public Charjabug(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);
        this.addMove(new Facade());
        this.addMove(new ChargeBeam());
        this.addMove(new Crunch());
    }
}
