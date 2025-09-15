import java.util.*;

public class MealKitAppMain {
    public static void main(String[] args) {
        MealKitService service = new MealKitService();
        service.createMenu();

        // Create Plans
        Plan vegPlan = new VegPlan("P1", 3, 10.0, Arrays.asList("Indian", "Italian"));
        Plan nonVegPlan = new NonVegPlan("P2", 4, 12.0, Arrays.asList("Chinese", "Mexican"));
        Plan familyPlan = new FamilyPlan("P3", 5, 9.0, Arrays.asList("Mixed"));

        // Create Subscribers
        Subscriber alice = new Subscriber("S1", "Alice", "alice@mail.com", "123 Lane", vegPlan);
        Subscriber bob = new Subscriber("S2", "Bob", "bob@mail.com", "456 Drive", nonVegPlan);

        // Create Orders
        Order order1 = service.createOrder("O1", alice, 36);
        order1.addMeal("M101", 2);
        order1.addMeal("M104", 1);
        order1.computeTotal();
        order1.applyCoupon("DISCOUNT10");
        service.scheduleDelivery(order1);
        order1.markDelivered();
        service.record
