package disSoftware.proyectoFinal;

public class World {
	private WorldType type;
    private int complexFactor;

    public World(WorldType type, int complexFactor) {
        this.type = type;
        this.complexFactor = complexFactor;
    }

    public WorldType getType() {
        return type;
    }

    public int getComplexFactor() {
        return complexFactor;
    }

}
