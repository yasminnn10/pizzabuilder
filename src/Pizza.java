public class Pizza {
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final String toppings;

    // Конструктор доступен только внутри пакета (без public)
    Pizza(String dough, String sauce, String cheese, String toppings) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" + "dough='" + dough + "', sauce='" + sauce +
                "', cheese='" + cheese + "', toppings='" + toppings + "'}";
    }
}