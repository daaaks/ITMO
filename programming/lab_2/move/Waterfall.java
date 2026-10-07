package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 100);
    }

    // Waterfall наносит урон и имеет 20% шанс вызвать у цели страх
    
    @Override public void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.2) {
            Effect.flinch(def);
        }
    }

    @Override public String describe() {
        return "использует Waterfall";
    }

}
