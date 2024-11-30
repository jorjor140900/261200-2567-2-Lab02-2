class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage <= 0.00 || discountPercentage >= 100.00) {
            System.out.println("Error: Invalid discount percentage.");
            return;
        }

        double discountAmount = (discountPercentage / 100) * price;
        double newPrice = price - discountAmount;

        setPrice(newPrice);  // Correct method call

        System.out.printf("Discount of %.2f%% applied. New price: $%.2f%n", discountPercentage, newPrice);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
