package disSoftware.proyectoFinal;

public class World2SpiderMan implements Assassin {

	@Override
    public String getName() {
        return "Spider-Man";
    }

    @Override
    public Integer getPower() {
        return 70;
    }

    @Override
    public Integer getLives() {
        return 2;
    }

    public String getSuperPower() {
        return "Spider Sense & Web-Slinging";
    }

    @Override
    public String toString() {
        return "SpiderMan [name=" + getName() + ", power=" + getPower() + 
               ", lives=" + getLives() + ", superPower=" + getSuperPower() + "]";
    }
}
