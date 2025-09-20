// Entry point: demonstration of the factory's work
public class LunaCoffeeShop {
    public static void main(String[] args) {
        System.out.println("⭐First combo:");
        CoffeeDessertFactory itfactory = new ItalianCuisine(); // Italian cuisine factory
        Coffee itcoffee = itfactory.makeCoffee();
        Dessert itdessert = itfactory.makeDessert();

        itcoffee.prepare();
        itdessert.serve();

        System.out.println("⭐Second combo:");
        CoffeeDessertFactory jpfactory = new JapaneseCuisine(); // Japanese cuisine factory
        Coffee jpcoffee = jpfactory.makeCoffee();
        Dessert jpdessert = jpfactory.makeDessert();

        jpcoffee.prepare();
        jpdessert.serve();
    }
}