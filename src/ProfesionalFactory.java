public class ProfesionalFactory extends LaptopsFactory{

    @Override
    public Laptops ejecutarLaptops() {
        return new Profesional(
                "Macbook",
                "Pro",
                2022,
                "Apple Silicon M2",
                16
        );
    }
}
