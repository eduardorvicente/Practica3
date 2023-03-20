public class Jamon extends IngredienteDecorador{
    public Jamon(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 20 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Jamon";
    }
}

