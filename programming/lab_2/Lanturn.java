package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Lanturn extends Pokemon {
    public Lanturn(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.ELECTRIC);
        setStats(125, 58, 58, 76, 76, 67);
        this.addMove(new BubbleBeam());
        this.addMove(new Swagger());
        this.addMove(new Waterfall());
        this.addMove(new EerieImpulse());
    }
}
