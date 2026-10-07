package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    // Take Down наносит урон, но атакующий получает 1/4 нанесенного урона в виде отдачи

    @Override public void applySelfDamage(Pokemon att, double damage) {
        super.applySelfDamage(att, damage / 4.0);
    }

    @Override public String describe() {
        return "применяет Take Down";
    }
}
