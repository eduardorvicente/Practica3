public class Jitomate extends IngredienteDecorador{
    public Jitomate(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 5 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Jitomate";
    }
}

