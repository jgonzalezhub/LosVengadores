package disSoftware.proyectoFinal;

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
        return wrapped.getDescription() + " Assemble ";
    }

}
