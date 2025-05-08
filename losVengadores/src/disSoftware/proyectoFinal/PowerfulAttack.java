package disSoftware.proyectoFinal;

public class PowerfulAttack extends ActionDecorator {

	public PowerfulAttack(Action wrapped) {
		super(wrapped);
		// TODO Auto-generated constructor stub
	}
	
	public Integer execute(Player attacker, Enemy defender) {
        Integer damage = (int) (wrapped.execute(attacker, defender)*1.5);
        return damage;
    }

    @Override
    public String getDescription() {
        return wrapped.getDescription() + " Maximum pulse ";
    }


}
