public class GamerFactory extends LaptopsFactory{

    @Override
    public Laptops ejecutarLaptops() {
        return new Gamer(
                "Macbook",
                "Air",
                2017,
                "Silicon M1",
                13
        );
    }
}
