package disSoftware.proyectoFinal;

public abstract class Enemy extends Character{
	
    protected Strategy strategy;

    //CONSTRUCTOR
    public Enemy(String name, Integer power,Integer health,Integer defense, String specialText,Integer specialNumber){
        super(name, power, health,defense, specialText, specialNumber);
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
