public class Mostaza extends IngredienteDecorador{
    public Mostaza(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 2 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Mostaza";
    }
}

