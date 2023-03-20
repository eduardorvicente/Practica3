public class Catsup extends IngredienteDecorador{

    public Catsup(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 1 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Catsup";
    }
}
