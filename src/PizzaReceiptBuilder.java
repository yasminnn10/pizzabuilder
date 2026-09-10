public class PizzaReceiptBuilder implements PizzaBuilder {
    private final StringBuilder sb = new StringBuilder("=== ЧЕК НА ПИЦЦУ ===\n");

    @Override
    public PizzaReceiptBuilder setDough(String dough) {
        sb.append("Тесто: ").append(dough).append("\n");
        return this;
    }

    @Override
    public PizzaReceiptBuilder setSauce(String sauce) {
        sb.append("Соус:  ").append(sauce).append("\n");
        return this;
    }

    @Override
    public PizzaReceiptBuilder setCheese(String cheese) {
        sb.append("Сыр:   ").append(cheese).append("\n");
        return this;
    }

    @Override
    public PizzaReceiptBuilder setToppings(String toppings) {
        sb.append("Топпинг: ").append(toppings).append("\n");
        return this;
    }

    public String getResult() {
        return sb.toString();
    }
}