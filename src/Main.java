void main() {
    System.out.println("BIENVENIDOS A LA FABRICA DE LAPTOPS");
    System.out.println(" ");

    LaptopsFactory factory;

    factory = new GamerFactory();
    Laptops gamer = factory.ejecutarLaptops();
    gamer.ejecutar();

    factory = new BasicoFactory();
    Laptops basico = factory.ejecutarLaptops();
    basico.ejecutar();

    factory = new ProfesionalFactory();
    Laptops profesional = factory.ejecutarLaptops();
    profesional.ejecutar();
}