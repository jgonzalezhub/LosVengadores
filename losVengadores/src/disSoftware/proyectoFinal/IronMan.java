package disSoftware.proyectoFinal;

public class IronMan extends Enemy { 
	
	public IronMan(String name, Integer power, Integer health,Integer defense, String specialText, Integer specialNumber, State state) {
		super(name, power, health,defense, specialText, specialNumber, state);
		// TODO Auto-generated constructor stub
	}
	protected void decideNextStrategy(Character opponent) {
        setStrategy(new IronManStrategy());
    }
}
