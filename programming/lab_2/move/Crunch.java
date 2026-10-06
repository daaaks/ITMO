package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 80, 100);
    }

    // Crunch наносит урон и имеет 20% шанс понизить защиту противника на 1 уровень
    @Override public void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.2) {
            def.setMod(Stat.DEFENSE, -1);
        }
    }

    @Override public String describe() {
        return "применяет Crunch";
    }
}
