package disSoftware.proyectoFinal;

public class ActiveState implements State{

	public void handle(Character character) {
		System.out.println(character.getName() + "está ACTIVO.");
	}

	@Override
	public String getName() {
		return "Activo";
	}
}
