public class Mayonesa extends IngredienteDecorador{
    public Mayonesa(Baguette baguette){
        this.baguette = baguette;
    }
    @Override
    public double costo() {
        return 3 + baguette.costo();
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+", Mayonesa";
    }
}

