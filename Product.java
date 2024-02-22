package work;

public class Product {
	 private String productCode;
	    private String productName;
	    private String productCategory;
	    private String productWarranty;
	    private double productPrice;
	    private int productStock;

	    public Product(String productCode, String productName, String productCategory, String productWarranty, double productPrice, int productStock) {
	        this.productCode = productCode;
	        this.productName = productName;
	        this.productCategory = productCategory;
	        this.productWarranty = productWarranty;
	        this.productPrice = productPrice;
	        this.productStock = productStock;
	    }

	    public void setProductWarranty(String productWarranty) {
	        this.productWarranty = productWarranty;
	    }

	    public void setProductPrice(double productPrice) {
	        this.productPrice = productPrice;
	    }

	    public void setProductStock(int productStock) {
	        this.productStock = productStock;
	    }
	    public void setProductName(String newproductName) {
			this.productName = productName;
			
			
		}

		public void setProductCategory(String newproductCategory) {
			this.productCategory = productCategory;
		}
			
			
		

	    @Override
	    public String toString() {
	        return "Product Code: " + productCode + ", Product Name: " + productName + ", Product Category: " + productCategory + ", Product Warranty: " + productWarranty + ", Product Price: " + productPrice + ", Product Stock: " + productStock;
	    }
		
	}

