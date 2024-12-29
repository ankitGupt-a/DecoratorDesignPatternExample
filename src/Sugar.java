public class Sugar extends CoffeeDecorator{
    public Sugar(final Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 2;
    }

    public String description() {
        return coffee.description() + " with sugar ";
    }
}
