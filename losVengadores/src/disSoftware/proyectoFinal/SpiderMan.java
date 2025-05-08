package disSoftware.proyectoFinal;

public class SpiderMan extends Enemy{
	
	public SpiderMan(String name, Integer power, Integer health,Integer defense, String specialText, Integer specialNumber) {
		super(name, power, health,defense,specialText, specialNumber);
		// TODO Auto-generated constructor stub
	}
	protected void decideNextStrategy(Character opponent) {
        setStrategy(new SpidermanStrategy());
    }
}
