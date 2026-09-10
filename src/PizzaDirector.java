public class PizzaDirector {

    public void makeMargarita(PizzaBuilder builder) {
        builder.setDough("Тонкое тесто")
                .setSauce("Томатный соус")
                .setCheese("Моцарелла")
                .setToppings("Базилик");
    }

    public void makePepperoni(PizzaBuilder builder) {
        builder.setDough("Традиционное тесто")
                .setSauce("Острый томатный соус")
                .setCheese("Моцарелла")
                .setToppings("Пепперони");
    }

    public void makeFourCheese(PizzaBuilder builder) {
        builder.setDough("Тонкое тесто")
                .setSauce("Сливочный соус")
                .setCheese("Моцарелла, Пармезан, Дор Блю, Чеддер")
                .setToppings("Без топпинга");
    }
}