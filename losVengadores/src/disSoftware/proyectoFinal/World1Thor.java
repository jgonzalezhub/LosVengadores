package disSoftware.proyectoFinal;

public class World1Thor implements Powerful {
	@Override
    public String getName() {
        return "Thor";
    }

    @Override
    public Integer getPower() {
        return 90;
    }

    @Override
    public Integer getLives() {
        return 3;
    }

    public String getSuperPower() {
        return "Mjolnir Lightning";
    }

    @Override
    public String toString() {
        return "Thor [name=" + getName() + ", power=" + getPower() + 
               ", lives=" + getLives() + ", superPower=" + getSuperPower() + "]";
    }

}
