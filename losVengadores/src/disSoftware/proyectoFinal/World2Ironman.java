package disSoftware.proyectoFinal;

public class World2Ironman implements Tactical {
		 @Override
		    public String getName() {
		        return "Iron Man";
		    }

		    @Override
		    public Integer getPower() {
		        return 85;
		    }

		    @Override
		    public Integer getLives() {
		        return 3;
		    }

		    public String getSuperPower() {
		        return "Powered Armor (Earth Tech)";
		    }

		    @Override
		    public String toString() {
		        return "IronMan [name=" + getName() + ", power=" + getPower() + 
		               ", lives=" + getLives() + ", superPower=" + getSuperPower() + "]";
		    }
}

