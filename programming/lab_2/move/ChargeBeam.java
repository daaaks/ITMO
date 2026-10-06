package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    // Charge Beam наносит урон и 70% шанс увеличить специальную атаку на 1 уровень у атакующего
    @Override public void applySelfEffects(Pokemon att) {
        if (Math.random() <= 0.7) {
            att.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override public String describe() {
        return "применяет Charge Beam";
    }

}
