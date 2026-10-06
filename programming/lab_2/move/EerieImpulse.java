package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class EerieImpulse extends StatusMove {
    public EerieImpulse() {
        super(Type.ELECTRIC, 0, 100);
    }

    // Eerie Impulse понижает специальную атаку цели на 2 уровня
    @Override public void applyOppEffects(Pokemon def) {
        def.setMod(Stat.SPECIAL_ATTACK, -2);
    }
    
    @Override public String describe(){
        return "использует Eerie Impulse";
    }

}
