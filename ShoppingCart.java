import java.util.*;

public class ShoppingCart implements Cart {

	ArrayList<SelectedItem> cartStuff = new ArrayList<SelectedItem>();
   
	public void addItem(SelectedItem newItem) {
    	int p = newItem.getQuantity();
    	int l = cartStuff.size();
    	if (cartStuff.contains(newItem)) {
    		newItem.setQuantity(p + 1);
    	} else {
    		cartStuff.add(newItem);
    	}
	}
    
    public void deleteItem(int deleteItemNumber) {
    	int p = deleteItemNumber;
    	cartStuff.remove(p);
    	
    }
    
    
    
    public double getTotal() {
    	int z = cartStuff.size();
    	double total = 0;
    	for (int q = 0; q < z; q++) {
    		SelectedItem b = (SelectedItem) cartStuff.get(q);
    		int o = b.getQuantity();
    		double currPrice = b.getUnitPrice() * o;
    		total = total + currPrice;
    	}
    	return total;
    }
    
    public double getTax() {
    	double p = getTotal();
    	double taxRate = 0.045;
    	double taxCost = taxRate * p;
    	return taxCost;
    }
    
    public double getShipping() {
    	double p = getTotal();
    	double shippingCost;
    	double overTenRate = 0.15;
    	if (p > 10.00) {
    		shippingCost = overTenRate * p;
    	} else {
    		shippingCost = 2.50 + p;
    	}
    	return shippingCost;
    	
    }
    
    public String toString() {
    	int p = cartStuff.size();
    	String last = "";
    	for (int r = 0; r < p; r++) {
    		SelectedItem o = (SelectedItem) cartStuff.get(r);
    		String name = o.getDescription();
    		int quantity = o.getQuantity();
    		double unitPrice = o.getUnitPrice();
    		double totalPrice = unitPrice * quantity;
    		double h = Math.round(totalPrice*100.0)/100.0;
    		String item = ("\nItem: " + name + "\nQuantity: " + quantity + "\nUnit Price: " + unitPrice + "\nTotal Price: " + h);
    		last = last + item;
    	}
    	double s = Math.round(getTotal()*100.0/100.0);
    	double e = Math.round(getShipping()*100.0/100.0);
    	double k = Math.round(getTax()*100.0/100.0);
    	double u = k + e + s;
    	last = last + "" + "\nTotal: " + s + "\nTax: " + k + "\nShipping: " +
    	e + "\nGRAND TOTAL: " + u;
    	return last;
    }

} 