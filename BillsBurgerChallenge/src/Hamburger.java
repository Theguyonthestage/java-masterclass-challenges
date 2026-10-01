public class Hamburger {
    private String hamburgerName;
    private String breadType;
    private String meat;
    private double basePrice;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;


    public Hamburger(String hamburgerName, String breadType, String meat) {
        this.hamburgerName = hamburgerName;
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = 5.00;

    }

    public void addAdditions(Addition addition) {
        if (addition1 == null) {
            addition1 = addition;
        } else if (addition2 == null) {
            addition2 = addition;
        } else if (addition3 == null) {
            addition3 = addition;
        } else if (addition4 == null) {
            addition4 = addition;
        } else {
            System.out.println("No more additions allowed!");
        }

    }

    public double totalPrice() {
        double total = basePrice;
        if (addition1 != null) {
            total += addition1.getAdditionPrice();
        }
        if (addition2 != null) {
            total += addition2.getAdditionPrice();
        }
        if (addition3 != null) {
            total += addition3.getAdditionPrice();
        }
        if (addition4 != null) {
            total += addition4.getAdditionPrice();
        }
        return total;
    }
    public void printReceipt(){
        printReceiptBody();
        System.out.printf("Total: %.2f%n", totalPrice());

    }
    protected void printReceiptBody() {
        System.out.printf("Burger: %s (%s, %s)%nBase price: %.2f%n",
                getHamburgerName(),
                getBreadType(),
                getMeat(),
                getBasePrice());

        if (addition1 != null) {
            System.out.printf(" + %s: %.2f%n", addition1.getAddition(), addition1.getAdditionPrice());
        }
        if (addition2 != null) {
            System.out.printf(" + %s: %.2f%n", addition2.getAddition(), addition2.getAdditionPrice());
        }
        if (addition3 != null) {
            System.out.printf(" + %s: %.2f%n", addition3.getAddition(), addition3.getAdditionPrice());
        }
        if (addition4 != null) {
            System.out.printf(" + %s: %.2f%n", addition4.getAddition(), addition4.getAdditionPrice());
        }

        if (addition1 == null && addition2 == null && addition3 == null && addition4 == null) {
            System.out.printf("No additions added.%n");
        }


    }

    public String getHamburgerName() {
        return hamburgerName;
    }

    public void setHamburgerName(String hamburgerName) {
        this.hamburgerName = hamburgerName;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }


}



