package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    // Facade наносит урон, и если атакующий парализован, отравлен или горит, то наносимый урон удваивается
    
    @Override public double calcBaseDamage(Pokemon att, Pokemon def) {
        if (att.getCondition() == Status.PARALYZE || att.getCondition() == Status.BURN || att.getCondition() == Status.POISON) {
            return super.calcBaseDamage(att, def) * 2;
        }
        return super.calcBaseDamage(att, def);
    }

    @Override public String describe() {
        return "использует Facade";
    }

}
