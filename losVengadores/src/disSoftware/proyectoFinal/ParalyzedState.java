package disSoftware.proyectoFinal;

public class ParalyzedState implements State{

	@Override
	public void handle(Character character) {
		System.out.println(character.getName()+ "esta PARALIZADO.");
	}

	@Override
	public String getName() {
		return "Paralizado";
	}

}
