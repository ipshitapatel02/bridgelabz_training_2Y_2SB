package class_object;

import java.util.ArrayList;

interface Taxable {
 double calculateTax();
 String getTaxDetails();
}
abstract class Product {
 private int productId;
 private String name;
 private double price;
 Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }
 public int getProductId() { return productId; }
 public String getName() { return name; }
 public double getPrice() { return price; }
 public void setPrice(double price) { this.price = price; }
 abstract double calculateDiscount();
}
class Electronics extends Product implements Taxable {
 Electronics(int id, String name, double price) {
     super(id, name, price);
 }
 public double calculateDiscount() {
     return getPrice() * 0.10;
 }
 public double calculateTax() {
     return getPrice() * 0.18;
 }
 public String getTaxDetails() {
     return "18% GST applied";
 }
}
class Clothing extends Product implements Taxable {
 Clothing(int id, String name, double price) {
     super(id, name, price);
 }
 public double calculateDiscount() {
     return getPrice() * 0.20;
 }
 public double calculateTax() {
     return getPrice() * 0.05;
 }
 public String getTaxDetails() {
     return "5% VAT applied";
 }
}
class Groceries extends Product {
 Groceries(int id, String name, double price) {
     super(id, name, price);
 }

 public double calculateDiscount() {
     return 0;
 }
}
public class ECommercePlatform {
 static void printFinalPrice(Product p) {
     double price = p.getPrice();
     double discount = p.calculateDiscount();
     double tax = 0;
     if (p instanceof Taxable) {
         tax = ((Taxable) p).calculateTax();
     }
     double finalPrice = price + tax - discount;
     System.out.println("\nProduct: " + p.getName());
     System.out.println("Base Price: Rs." + price);
     System.out.println("Discount: Rs." + discount);
     if (p instanceof Taxable) {
         System.out.println("Tax: Rs." + tax + " (" + ((Taxable)p).getTaxDetails() + ")");
     } else {
         System.out.println("Tax: No tax applicable");
     }
     System.out.println("Final Price to Pay: Rs." + finalPrice);
 }
 public static void main(String[] args) {
     ArrayList<Product> items = new ArrayList<>();
     items.add(new Electronics(101, "Laptop", 55000));
     items.add(new Clothing(201, "T-Shirt", 1200));
     items.add(new Groceries(301, "Rice Bag", 900));
     for (Product p : items) {
         printFinalPrice(p);
     }
 }
}
