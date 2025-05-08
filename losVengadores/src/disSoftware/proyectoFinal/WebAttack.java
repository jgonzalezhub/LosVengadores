package disSoftware.proyectoFinal;

public class WebAttack extends ActionDecorator{

	   public WebAttack(Action wrapped) {
	       super(wrapped);
	   }

	   public Integer execute(Player attacker, Enemy defender) {
	       Integer webDamage = 5;
	       Integer damage = wrapped.execute(attacker, defender);
	       defender.setState(new ParalyzedState());
	       return damage + webDamage;
	    }

	    @Override
	    public String getDescription() {
	        return wrapped.getDescription() + " Web attack ";
	    }    

}
