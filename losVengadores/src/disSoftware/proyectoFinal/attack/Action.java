package disSoftware.proyectoFinal.attack;

import disSoftware.proyectoFinal.model.Enemy;
import disSoftware.proyectoFinal.model.Player;

public interface Action {
    public Integer execute(Player attacker, Enemy defender);
    public String getDescription();
}
