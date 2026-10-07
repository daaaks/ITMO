package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }

    // Flamethower наносит урон и 10% шанс поджечь цель

    @Override public void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.10) {
            Effect.burn(def);
        }
    }

    @Override public String describe() {
        return "применяет Flamethrower";
    }
}
