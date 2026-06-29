public abstract class Laptops {
    protected String marca;
    protected String modelo;
    protected int anofabricacion;
    protected String procesador;
    protected int tamanoPantalla;

    public Laptops(String marca, String modelo, int anofabricacion, String procesador, int tamanoPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anofabricacion = anofabricacion;
        this.procesador = procesador;
        this.tamanoPantalla = tamanoPantalla;
    }
    public abstract void ejecutar();
}
