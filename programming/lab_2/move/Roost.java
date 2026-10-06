package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Roost extends StatusMove {
    public Roost() {
        super(Type.FLYING, 0, 100);
    }

    // Пользователь восстанавливает 50% от максимального HP
    @Override public void applySelfEffects(Pokemon att) {
        att.setMod(Stat.HP, (int) (att.getStat(Stat.HP) * 0.5));
    }

    @Override public String describe(){
        return "использует Roost";
    }

}
