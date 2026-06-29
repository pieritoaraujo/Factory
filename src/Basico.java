public class Basico extends Laptops{
    public Basico(String marca, String modelo, int anofabricacion, String procesador, int tamanoPantalla) {
        super(marca, modelo, anofabricacion, procesador, tamanoPantalla);
    }
    @Override
    public void ejecutar (){
        System.out.println("Corriendo programas en una Laptop Basica");
        System.out.println("Laptop Basica");
        System.out.println("Marca y Modelo: " +marca + " " +modelo);
        System.out.println("Ano de Fabricación: " +anofabricacion);
        System.out.println("Procesador: " +procesador);
        System.out.printf("Tamano de la Pantalla: " +tamanoPantalla);
    }
}
