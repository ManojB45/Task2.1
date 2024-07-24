package task2;

import java.util.Scanner;


class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[5];

	        // Accepting product information from the user
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Enter details for product " + (i + 1) + ": ");
	            System.out.print("Product ID: ");
	            int pid = scanner.nextInt();
	            System.out.print("Price: ");
	            double price = scanner.nextDouble();
	            System.out.print("Quantity: ");
	            int quantity = scanner.nextInt();
	            products[i] = new Product(pid, price, quantity);
	        }

	        // Finding the product with the highest price
	        Product maxPriceProduct = products[0];
	        for (Product product : products) {
	            if (product.getPrice() > maxPriceProduct.getPrice()) {
	                maxPriceProduct = product;
	            }
	        }

	        System.out.println("Product with the highest price: PID = " + maxPriceProduct.getPid());

	        // Calculating the total amount spent on all products
	        double totalAmount = calculateTotalAmount(products);
	        System.out.println("Total amount spent on all products: " + totalAmount);
	    }

	    // Method to calculate and return the total amount spent on all products
	    public static double calculateTotalAmount(Product[] products) {
	        double total = 0.0;
	        for (Product product : products) {
	            total += product.getPrice() * product.getQuantity();
	        }
	        return total;


	}

}
