public class Pollo extends IngredienteDecorador{
    public Pollo(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 20 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Pollo";
    }
}

