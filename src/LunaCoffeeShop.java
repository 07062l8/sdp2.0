public class LunaCoffeeShop {
    public static void main(String[] args) {
        System.out.println("⭐First combo:");
        CoffeeDessertFactory itfactory = new ItalianCuisine();
        Coffee itcoffee = itfactory.makeCoffee();
        Dessert itdessert = itfactory.makeDessert();

        itcoffee.prepare();
        itdessert.serve();

        System.out.println("⭐Second combo:");
        CoffeeDessertFactory jpfactory = new JapaneseCuisine();
        Coffee jpcoffee = jpfactory.makeCoffee();
        Dessert jpdessert = jpfactory.makeDessert();

        jpcoffee.prepare();
        jpdessert.serve();
    }
}