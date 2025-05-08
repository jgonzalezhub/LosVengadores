package disSoftware.proyectoFinal;

public class WoundedState implements State{

	@Override
	public void handle(Character character) {
		System.out.println(character.getName() + "esta HERIDO.");	
		character.defense = (int) (character.defense * 0.7);
	}

	@Override
	public String getName() {
		return "Wounded";
	}

}
