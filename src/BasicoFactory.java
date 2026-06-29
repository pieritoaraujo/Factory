public class BasicoFactory extends LaptopsFactory {

    @Override
    public Laptops ejecutarLaptops(){
        return new Basico(
                "Dell",
                "Latitude",
                2020,
                "Intel Core i7",
                14
        );
    }
}
