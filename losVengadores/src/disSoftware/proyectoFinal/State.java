package disSoftware.proyectoFinal;

public interface State {
    public void handle(Character character);
    public String getName();
}
