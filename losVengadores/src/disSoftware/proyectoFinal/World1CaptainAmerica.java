package disSoftware.proyectoFinal;

public class World1CaptainAmerica implements Tank { // tiene que implementar a capitanamerica como interfaz 

	@Override
	public String getName() {
	    return "Captain America";
	}

	@Override
	public Integer getPower() {
	    return 75;
	}

	@Override
	public Integer getLives() {
	    return 2;
	}

	public String getSuperPower() {
	    return "Vibranium Shield & Leadership";
	}

	@Override
	public String toString() {
	    return "CaptainAmerica [name=" + getName() + ", power=" + getPower() + 
	           ", lives=" + getLives() + ", superPower=" + getSuperPower() + "]";
	}
	
	 

	    
}
