package disSoftware.proyectoFinal.attack;

public abstract class ActionDecorator implements Action{
    protected Action wrapped;

    public ActionDecorator(Action wrapped){
        this.wrapped = wrapped;
    }
}
