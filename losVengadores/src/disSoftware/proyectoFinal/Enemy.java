package disSoftware.proyectoFinal;

public abstract class Enemy extends Character{
	
    protected Strategy strategy;
    


    //CONSTRUCTOR
    public Enemy(String name, 
                 Integer power,
                 Integer health,
                 String specialText,
                 Integer specialNumber){
        super(name, power, health, specialText, specialNumber);
    }
}
