package disSoftware.proyectoFinal;

public abstract class Character {
    protected String name;
    protected Integer power;
	protected Integer health;

    //Se puede cambiar en la estrategia
    protected String specialText;
    protected Integer specialNumber;

    //Lo vamos a usar en el STATE
    protected State state;


    //CONSTRUCTORES
    public Character(String name, 
                     Integer power,
                     Integer health,
                     String specialText,
                     Integer specialNumber){
       this.name = name;
       this.power = power;
       this. health = health;
       this.specialText = specialText;
       this.specialNumber = specialNumber;                 
    }

    //GETTERS Y SETTERS
    public String getName() {
		return name;
	}
    public Integer getHealth() {
		return health;
	}
    public State getState(){
        return state;
    }
    public String getSpecialText(){
        return specialText;
    }
    public void setState(State state){
        this.State = state;
    }


    public Boolean isAlive(){
        return health > 0;
    }





}
