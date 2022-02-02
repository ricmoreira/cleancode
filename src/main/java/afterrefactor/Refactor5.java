package afterrefactor;

import java.util.ArrayList;

public class Refactor5 {

    private class Product {
        private String id;
        private String name;
        private double price;

        public Product(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        public String getID() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public boolean equals(Object obj) { // no need to refactor this method
            if (obj == null) return false;
            if (obj == this) return true;
            if (!(obj instanceof Product)) return false;
            Product o = (Product) obj;
            return o.id.equals(this.id);
        }
    }

    private class ShoppingCart {
        private ArrayList<Product> productList;

        public ShoppingCart() {
            this.productList = new ArrayList<>();
        }

        public void  addProduct(Product product) {
            this.productList.add(product);
        }

        public void removeProduct(Product product) {
            this.productList.remove(product);
        }

        public ArrayList<Product> getProducts() {
            return this.productList;
        }

        public double getTotalPrice() {
            return productList.stream().mapToDouble(Product::getPrice).sum();
        }
    }

    private class ShoppingSession {

        private ShoppingCart shoppingCart;

        public ShoppingSession(ShoppingCart shoppingCart) {
            this.shoppingCart = shoppingCart;
        }

        public void printOrderDetails() {
            printHeader();
            printDetails();
            printFooter();
        }

        private void printHeader() {
            // header section
            System.out.println ("*****************************");
            System.out.println ("****** Customer totals ******");
            System.out.println ("*****************************");
        }

        private void printDetails() {
            // order details section
            System.out.println ("*****************************");
            System.out.println ("****** Order Details ******");
            System.out.println ("*****************************");
            this.shoppingCart.getProducts().forEach(product -> {
                System.out.println (product.getID() + " - " +  product.getName() + " - " +  product.getPrice() );
            });
        }

        private void printFooter() {
            // footer section
            System.out.println("Thank you for buying with us!");
            System.out.println("Your order total amount: " + this.shoppingCart.getTotalPrice());
        }

    }

}
