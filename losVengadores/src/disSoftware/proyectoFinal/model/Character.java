package disSoftware.proyectoFinal.model;

import disSoftware.proyectoFinal.state.ActiveState;
import disSoftware.proyectoFinal.state.State;

public abstract class Character {
    protected String name;
    protected Integer power;
	protected Integer health;
	protected Integer defense;

    //Se puede cambiar en la estrategia
    protected String specialText;
    protected Integer specialNumber;

    //Lo vamos a usar en el STATE
    protected State state;


    //CONSTRUCTORES
    public Character(String name, 
                     Integer power,
                     Integer health,
                     Integer defense,
                     String specialText,
                     Integer specialNumber){
       this.name = name;
       this.power = power;
       this.health = health;
       this.defense=defense;
       this.specialText = specialText;
       this.specialNumber = specialNumber;  
       this.state = new ActiveState();
    }
    
    public void takeDamage(Integer damage) {
    	health-=damage;
    	if(health<=0) {
    		health=0;
    		System.out.println(name + " ha sido derrotado.");
    	}else if(this.health<=40 && !(this.state instanceof WoundedState)) {
            this.setState(new WoundedState());
    	}
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
    public void setState(State newState){
    	this.state = newState;
    }  
    public Boolean isAlive(){
        return health > 0;
    }
    public Integer getPower(){
    	return this.power;
    }
    
    public Integer getDefense(){
    	return this.defense; 
    }

	public Integer getSpecialNumber() {
		return specialNumber;
	}

	public void setSpecialNumber(Integer specialNumber) {
		this.specialNumber = specialNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

	public void setSpecialText(String specialText) {
		this.specialText = specialText;
	}


}
