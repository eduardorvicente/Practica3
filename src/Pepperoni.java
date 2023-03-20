public class Pepperoni extends IngredienteDecorador{
    public Pepperoni(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 20 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Pepperoni";
    }
}

