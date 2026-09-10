public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        // 1. Объект пиццы
        PizzaObjectBuilder objectBuilder = new PizzaObjectBuilder();
        director.makePepperoni(objectBuilder);
        Pizza pepperoni = objectBuilder.getResult();
        System.out.println("--- ОБЪЕКТ ПИЦЦЫ ---");
        System.out.println(pepperoni);

        System.out.println();

        // 2. Текстовый чек
        PizzaReceiptBuilder receiptBuilder = new PizzaReceiptBuilder();
        director.makePepperoni(receiptBuilder);
        String receipt = receiptBuilder.getResult();
        System.out.println(receipt);
    }
}