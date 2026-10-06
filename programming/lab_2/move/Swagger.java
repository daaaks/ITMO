package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }
    // Swagger вызывает у цели растерянность и увеличивает ее атаку на 2
    @Override public void applyOppEffects(Pokemon def) {
        def.confuse();
        def.setMod(Stat.ATTACK, 2);
    }
    
    @Override public String describe(){
        return "использует Swagger";
    }


}
