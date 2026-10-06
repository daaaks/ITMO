package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Vikavolt extends Pokemon {
    public Vikavolt(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.ELECTRIC);
        setStats(77, 70, 90, 145, 75, 43);
        this.addMove(new Facade());
        this.addMove(new ChargeBeam());
        this.addMove(new Crunch());
        this.addMove(new Roost());
    }
}
