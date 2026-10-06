package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Tauros extends Pokemon {
    public Tauros(String name, int level) {
        super(name, level);
        setStats(75, 100, 95, 40, 70, 110);
        setType(Type.NORMAL);
        this.addMove(new Swagger());
        this.addMove(new Flamethrower());
        this.addMove(new IceBeam());
        this.addMove(new TakeDown());
    }

}
