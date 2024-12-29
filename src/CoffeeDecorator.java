public abstract class CoffeeDecorator extends Coffee{
     protected final Coffee coffee;

     public CoffeeDecorator(final Coffee coffee) {
         this.coffee = coffee;
     }
}
