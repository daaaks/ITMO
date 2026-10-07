package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public final class Lanturn extends Chinchou {
    public Lanturn(String name, int level) {
        super(name, level);
        setStats(125, 58, 58, 76, 76, 67);
        this.addMove(new EerieImpulse());
    }
}
