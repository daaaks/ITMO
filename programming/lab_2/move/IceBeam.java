package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    // Ice Beam наносит урон и 10% шанс заморозить цель
    @Override public void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.1) {
            Effect.freeze(def);
        }
    }

    @Override public String describe() {
        return "применяет Ice Beam";
    }

}
