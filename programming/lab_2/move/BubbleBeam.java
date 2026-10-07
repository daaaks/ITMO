package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public final class BubbleBeam extends SpecialMove{
    public BubbleBeam() {
        super(Type.WATER, 65, 100);
    }
    
    // Bubble Beam наносит урон и 10% шанс понизить скорость противника на 1 уровень

    @Override public void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.1) {
            def.setMod(Stat.SPEED, -1);
        }
    }

    @Override public String describe() {
        return "применяет Bubble Beam";
    }
}
