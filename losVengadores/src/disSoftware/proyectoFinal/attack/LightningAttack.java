package disSoftware.proyectoFinal.attack;

import disSoftware.proyectoFinal.model.Enemy;
import disSoftware.proyectoFinal.model.Player;

public class LightningAttack extends ActionDecorator {

    public LightningAttack(Action wrapped) {
        super(wrapped);
    }

    @Override
    public Integer execute(Player attacker, Enemy defender) {
        Integer damage = wrapped.execute(attacker, defender);
        Integer lightningDamage = 15;       
        return damage + lightningDamage;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " imbuido con rayos ";
    }
}
