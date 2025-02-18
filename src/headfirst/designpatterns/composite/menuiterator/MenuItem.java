package headfirst.designpatterns.composite.menuiterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
 
	String name;
	String description;
	boolean vegetarian;
	double price;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}

	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
 
//	public void print() {
//		System.out.print("  " + getName());
//		if (isVegetarian()) {
//			System.out.print("(v)");
//		}
//		System.out.println(", " + getPrice());
//		System.out.println("     -- " + getDescription());
//	}

	public void print(int level) {
		String indentation = "";
		for (int i=0; i<level; i++) {
			indentation += "	";
		}

		indentation += ""; // Cause this is a leaf

		System.out.print(indentation + getName());
		if (isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrice());
		System.out.println(indentation + "  -- " + getDescription());
	}

}

