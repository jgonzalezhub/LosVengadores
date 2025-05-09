package disSoftware.proyectoFinal.attack;

import disSoftware.proyectoFinal.model.Enemy;
import disSoftware.proyectoFinal.model.Player;

public class ReflexAttack extends ActionDecorator{

	public ReflexAttack(Action wrapped) {
		super(wrapped);
		// TODO Auto-generated constructor stub
	}
	
	public Integer execute(Player attacker, Enemy defender) {
        Integer damage = wrapped.execute(attacker, defender)/2;       
        return damage;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " ASSEMBLE ";
    }

}
