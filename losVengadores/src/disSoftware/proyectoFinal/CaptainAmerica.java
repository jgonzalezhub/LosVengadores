package disSoftware.proyectoFinal;

public class CaptainAmerica extends Enemy {  
	
	public CaptainAmerica(String name,Integer power,Integer health,Integer defense,String specialText,Integer specialNumber, State state){
        super(name, power, health,defense,specialText, specialNumber, state);
    }
	protected void decideNextStrategy(Character opponent) {
        setStrategy(new CaptainAmericaStrategy());
    }
}
