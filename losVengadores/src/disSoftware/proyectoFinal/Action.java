package disSoftware.proyectoFinal;

public interface Action {
    public Integer execute(Player attacker, Enemy defender);
    public String getDescription();
}
