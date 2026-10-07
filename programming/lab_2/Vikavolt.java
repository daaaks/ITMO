package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Vikavolt extends Charjabug {
    public Vikavolt(String name, int level) {
        super(name, level);
        setStats(77, 70, 90, 145, 75, 43);
        this.addMove(new Roost());
    }
}
