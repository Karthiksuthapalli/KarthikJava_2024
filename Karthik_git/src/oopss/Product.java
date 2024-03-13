package oopss;

public class Product {
    String name;
    double price;

    Product setName(String name) {
        System.out.println("this is setname method");
        this.name = name;
        return this; // Return the current instance of Product
    }

    Product setPrice(double price) {
        this.price = price;
        return this; // Return the current instance of Product
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Product product = new Product();
        //product.display();
        product.setName("karthik");
        System.out.println(product.name);

    }
}

    

