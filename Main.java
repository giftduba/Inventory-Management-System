package work;

import java.util.*;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	    private static Map<String, Product> products = new HashMap<>();

	    public static void main(String[] args) {
	        // Display the menu
	        while (true) {
	        	System.out.println("Bright Future Technologies Application");
	            System.out.println("*****************************");
	            Scanner user = new Scanner(System.in);
	            System.out.println("Enter (1) to Launch menu or any other key to exit");
	            String input = user.nextLine();
	            if (input.equals("1")) {
	                // Launch the menu
	                System.out.println("Please select one of thee following menu items: ");
	            } else {
	                // Exit the program
	                System.out.println("Exiting program...");
	                continue;
	            }
	            System.out.println("1. Capture Product");
	            System.out.println("2. Update Product");
	            System.out.println("3. Delete Product");
	            System.out.println("4. Search Product");
	            System.out.println("5. View Report");
	            System.out.println("6. Exit");

	            int choice = scanner.nextInt();
	            scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    captureProduct();
	                    break;
	                case 2:
	                    updateProduct();
	                    break;
	                case 3:
	                    deleteProduct();
	                    break;
	                case 4:
	                    searchProduct();
	                    break;
	                case 5:
	                    viewReport();
	                    break;
	                case 6:
	                	main(args);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void captureProduct() {
	    	System.out.println("Capture a new prouduct") ;
	           System.out.println("*****************************");
	           String NewProuduct = scanner.nextLine();
	           
	        System.out.println("Enter product code:");
	        String productCode = scanner.nextLine();

	        System.out.println("Enter product name:");
	        String productName = scanner.nextLine();

	        System.out.println("Enter product category:");
	        String productCategory = scanner.nextLine();

	        System.out.println("Enter product warranty:");
	        String productWarranty = scanner.nextLine();

	        System.out.println("Enter product price:");
	        double productPrice = scanner.nextDouble();

	        System.out.println("Enter product stock:");
	        int productStock = scanner.nextInt();

	        Product product = new Product(productCode, productName, productCategory, productWarranty, productPrice, productStock);
	        products.put(productCode, product);

	        System.out.println("Product captured successfully.");
	    }

	    private static void updateProduct() {
	        System.out.println("Enter product code to update:");
	        System.out.println("*****************************");
	        String productCode = scanner.nextLine();

	        Product product = products.get(productCode);

	        if (product == null) {
	            System.out.println("Product not found.");
	            return;
	        }

	        System.out.println("1. Update product warranty");
	        System.out.println("2. Update product price");
	        System.out.println("3. Update product stock level");
	        System.out.println("4. Update product category ");
	        System.out.println("5. Update product name ");

	        int choice = scanner.nextInt();
	        scanner.nextLine();

	        switch (choice) {
	            case 1:
	                System.out.println("Enter new product warranty:");
	                String newProductWarranty = scanner.nextLine();
	                product.setProductWarranty(newProductWarranty);
	                break;
	            case 2:
	                System.out.println("Enter new product price:");
	                double newProductPrice = scanner.nextDouble();
	                product.setProductPrice(newProductPrice);
	                break;
	            case 3:
	                System.out.println("Enter new product stock level:");
	                int newProductStock = scanner.nextInt();
	                product.setProductStock(newProductStock);
	                break;
	            case 4:
	            	System.out.println("Enter new product category:");
	            	String newproductCategory = scanner.nextLine();
	            	product.setProductCategory(newproductCategory);
	                break;
	            case 5:
	            	System.out.println("Enter new product name :");
	                String newproductName = scanner.nextLine();
	                product.setProductName(newproductName);
	                break;
	            default:
	                System.out.println("Invalid choice. Please try again.");
	        }

	        System.out.println("Product updated successfully.");
	    }

	    private static void deleteProduct() {
	        System.out.println("Enter product code to delete:");
	        System.out.println("*****************************");
	        String productCode = scanner.nextLine();

	        Product product = products.get(productCode);

	        if (product == null) {
	            System.out.println("Product not found.");
	            return;
	        }

	        System.out.println("Are you sure you want to delete this product? (yes/no)");
	        String confirmation = scanner.nextLine();

	        if (confirmation.equalsIgnoreCase("yes")) {
	            products.remove(productCode);
	            System.out.println("Product deleted successfully.");
	        } else {
	            System.out.println("Product deletion cancelled.");
	        }
	    }

	    private static void searchProduct() {
	        System.out.println("Enter product code to search:");
	        System.out.println("*****************************");
	        String productCode = scanner.nextLine();

	        Product product = products.get(productCode);

	        if (product == null) {
	            System.out.println("Product not found.");
	            return;
	        }
	        
	        System.out.println("Product details:");
	        System.out.println(product);
	    }

	    private static void viewReport() {
	        System.out.println("Inventory Report:");
	        System.out.println("*****************************");
	        for (Product product : products.values()) {
	            System.out.println(product);
	        }
	    }
	}



