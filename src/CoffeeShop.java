public class CoffeeShop {
    public static void main(String[] args) {
        BasicCoffee basicCoffee = new BasicCoffee();

        Milk milk = new Milk(basicCoffee);
        System.out.println("Cost of " + milk.description() + milk.cost());

        Sugar sugar = new Sugar(milk);
        System.out.println(("Cost of " + sugar.description() + sugar.cost()));

        WhippedCream whippedCream = new WhippedCream(sugar);
        System.out.println("Cost of " + whippedCream.description() + whippedCream.cost());
    }
}