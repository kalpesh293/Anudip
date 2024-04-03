/*Write a Java programming to create a e-commerce system with three classes product customer and order, online product and physical 
product are implementation of Product interface. procuct intrface has list of product as method for adding them. Product should be
the iterface with methods show product, addproduct, delete product, and claculate product prize*/

package EncapsulationAbstraction;

import java.util.Scanner;

interface Product 
{
    void showProduct();
    void addProduct(String name, double price);
    void deleteProduct(String name);
    double calculateProductPrice();
}

class OnlineProduct implements Product 
{
    private String[] products;
    private double[] prices;
    private int size;

    public OnlineProduct(int capacity)
    {
        products = new String[capacity];
        prices = new double[capacity];
        size = 0;
    }

    @Override
    public void showProduct() 
    {
        System.out.println("Online Products:");
        for (int i = 0; i < size; i++)
        {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i]);
        }
    }

    @Override
    public void addProduct(String name, double price)
    {
        products[size] = name;
        prices[size] = price;
        size++;
    }

    @Override
    public void deleteProduct(String name)
    {
        int index = -1;
        for (int i = 0; i < size; i++) 
        {
            if (products[i].equals(name)) 
            {
                index = i;
                break;
            }
        }
        if (index != -1) 
        {
            for (int i = index; i < size - 1; i++) 
            {
                products[i] = products[i + 1];
                prices[i] = prices[i + 1];
            }
            size--;
            System.out.println("Product '" + name + "' deleted successfully.");
        }
        else 
        {
            System.out.println("Product not found.");
        }
    }

    @Override
    public double calculateProductPrice() 
    {
        double totalPrice = 0;
        for (int i = 0; i < size; i++)
        {
            totalPrice += prices[i];
        }
        return totalPrice;
    }
}

class PhysicalProduct implements Product
{
    private String[] products;
    private double[] prices;
    private int size;

    public PhysicalProduct(int capacity)
    {
        products = new String[capacity];
        prices = new double[capacity];
        size = 0;
    }

    @Override
    public void showProduct()
    {
        System.out.println("Physical Products:");
        for (int i = 0; i < size; i++) 
        {
            System.out.println((i + 1) + ". " + products[i] + " - " + prices[i]);
        }
    }

    @Override
    public void addProduct(String name, double price)
    {
        products[size] = name;
        prices[size] = price;
        size++;
    }

    @Override
    public void deleteProduct(String name) 
    {
        int index = -1;
        for (int i = 0; i < size; i++)
        {
            if (products[i].equals(name)) 
            {
                index = i;
                break;
            }
        }
        if (index != -1)
        {
            for (int i = index; i < size - 1; i++) 
            {
                products[i] = products[i + 1];
                prices[i] = prices[i + 1];
            }
            size--;
            System.out.println("Product '" + name + "' deleted successfully.");
        } 
        else
        {
            System.out.println("Product not found.");
        }
    }

    @Override
    public double calculateProductPrice() 
    {
        double totalPrice = 0;
        for (int i = 0; i < size; i++)
        {
            totalPrice += prices[i];
        }
        return totalPrice;
    }
}

class Customer
{
    private String name;
    private String email;

    public Customer(String name, String email) 
    {
        this.name = name;
        this.email = email;
    }

    public String getName() 
    {
        return name;
    }

    public String getEmail() 
    {
        return email;
    }
}

class Order 
{
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product) 
    {
        this.customer = customer;
        this.product = product;
    }

    public void displayOrderDetails() 
    {
        System.out.println("Order Details:");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Email: " + customer.getEmail());
        product.showProduct();
        System.out.println("Total Price: " + product.calculateProductPrice());
    }
}

public class EcommerceApp 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of online products: ");
        int maxOnlineProducts = scanner.nextInt();
        scanner.nextLine(); 

        OnlineProduct onlineProduct = new OnlineProduct(maxOnlineProducts);

        System.out.print("Enter the maximum number of physical products: ");
        int maxPhysicalProducts = scanner.nextInt();
        scanner.nextLine(); // consume newline

        PhysicalProduct physicalProduct = new PhysicalProduct(maxPhysicalProducts);

        Customer customer = new Customer("kalpesh", "kalpesh@12.com");

        addProducts(scanner, onlineProduct, "Online");
        addProducts(scanner, physicalProduct, "Physical");

        System.out.println("=== Order Details ===");
        Order onlineOrder = new Order(customer, onlineProduct);
        onlineOrder.displayOrderDetails();

        Order physicalOrder = new Order(customer, physicalProduct);
        physicalOrder.displayOrderDetails();

        scanner.close();
    }

    private static void addProducts(Scanner scanner, Product product, String productType)
    {
        System.out.println("Adding " + productType + " Products:");
        while (true) 
        {
            System.out.print("Enter product name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done"))
            {
                break;
            }
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 
            product.addProduct(name, price);
        }
	}

}
