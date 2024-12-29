public class WhippedCream extends CoffeeDecorator{

    public WhippedCream(final Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 10;
    }

    public String description() {
        return coffee.description() + " with whipped cream ";
    }
}
