// Italian factory: Espresso + Tiramisu
public class ItalianCuisine implements CoffeeDessertFactory {
    @Override
    public Coffee makeCoffee() {
        return new Espresso();
    }

    @Override
    public Dessert makeDessert() {
        return new Tiramisu();
    }
}
