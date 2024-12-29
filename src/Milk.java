public class Milk extends CoffeeDecorator{

    public Milk(final Coffee coffee) {
        super(coffee);
    }

    public double cost() {
        return coffee.cost() + 20;
    }

    public String description() {
        return coffee.description() + " with milk ";
    }
}
