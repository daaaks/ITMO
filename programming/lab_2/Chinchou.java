package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Chinchou extends Pokemon {
    public Chinchou(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ELECTRIC);
        setStats(75, 38, 38, 56, 56, 67);
        this.addMove(new BubbleBeam());
        this.addMove(new Swagger());
        this.addMove(new Waterfall());
    }
}
