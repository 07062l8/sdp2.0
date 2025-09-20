public class JapaneseCuisine implements CoffeeDessertFactory {
    @Override
    public Coffee makeCoffee() {
        return new Matcha();
    }

    @Override
    public Dessert makeDessert() {
        return new Mochi();
    }
}
