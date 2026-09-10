public class PizzaObjectBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private String cheese;
    private String toppings;

    @Override
    public PizzaObjectBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaObjectBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaObjectBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaObjectBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza getResult() {
        if (dough == null || sauce == null) {
            throw new IllegalStateException("Для пиццы обязательно нужны тесто и соус!");
        }
        return new Pizza(dough, sauce, cheese, toppings);
    }
}