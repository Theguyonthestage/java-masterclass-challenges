public class HealthyBurger extends Hamburger {
    private Addition healthyAddition1;
    private Addition healthyAddition2;


    public HealthyBurger(String hamburgerName, String meat) {
        super(hamburgerName, "Brown rye", meat);

    }

    public void addHealthyAdditions(Addition addition) {
        if (healthyAddition1 == null) {
            healthyAddition1 = addition;
        } else if (healthyAddition2 == null) {
            healthyAddition2 = addition;
        } else {
            System.out.println("No more additions allowed!");
        }
    }

    @Override
    public double totalPrice() {
        double totalPriceForHealthy = super.totalPrice();
        if (healthyAddition1 != null) {
            totalPriceForHealthy += healthyAddition1.getAdditionPrice();
        }
        if (healthyAddition2 != null) {
            totalPriceForHealthy += healthyAddition2.getAdditionPrice();
        }
        return totalPriceForHealthy;

    }

    @Override
    public void printReceipt() {
        super.printReceiptBody();
        if (healthyAddition1 != null) {
            System.out.printf(" + Healthy Burger addition %s: %.2f%n", healthyAddition1.getAddition(), healthyAddition1.getAdditionPrice());
        }
        if (healthyAddition2 != null) {
            System.out.printf(" + Healthy Burger addition %s: %.2f%n", healthyAddition2.getAddition(), healthyAddition2.getAdditionPrice());
        }
        if (healthyAddition1 == null && healthyAddition2 == null) {
            System.out.printf("No healthy additions added.%n");
        }

        System.out.printf("Total: %.2f%n", totalPrice());
    }
}
