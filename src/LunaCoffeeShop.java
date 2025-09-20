// Entry point: demonstration of the factory's work
public class LunaCoffeeShop {
    public static void main(String[] args) {
        System.out.println("⭐First combo:");
        // Create Italian coffee and dessert using Italian cuisine Factory
        CoffeeDessertFactory itfactory = new ItalianCuisine();
        Coffee itcoffee = itfactory.makeCoffee();
        Dessert itdessert = itfactory.makeDessert();

        itcoffee.prepare();
        itdessert.serve();

        System.out.println("⭐Second combo:");
        // Create Japanese coffee and dessert using Japanese cuisine factory
        CoffeeDessertFactory jpfactory = new JapaneseCuisine(); // Japanese cuisine factory
        Coffee jpcoffee = jpfactory.makeCoffee();
        Dessert jpdessert = jpfactory.makeDessert();

        jpcoffee.prepare();
        jpdessert.serve();
    }
}