package disSoftware.proyectoFinal;

public class LightningAttack extends ActionDecorator {

    public LightningAttack(Action wrapped) {
        super(wrapped);
    }

    @Override
    public Integer execute(Player attacker, Enemy defender) {
        Integer damage = wrapped.execute(attacker, defender);
        Integer lightningDamage = 3;
        defender.takeDamage(lightningDamage);
        return damage + lightningDamage;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " + ha quedado electrocutado";
    }
}
