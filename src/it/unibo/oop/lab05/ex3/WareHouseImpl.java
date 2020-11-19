package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WareHouseImpl implements Warehouse {

	Set<Product> prodotti = new HashSet<>();
	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		prodotti.add(p);
	}

	@Override
	public Set<String> allNames() {
		// TODO Auto-generated method stub
		Set<String> temp = new HashSet<>();
		
		for(Product p : prodotti) {
			temp.add(p.getName());
		}
		
		return temp;
	}

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		Set<Product> temp = Set.copyOf(prodotti);
		return temp;
	}

	@Override
	public boolean containsProduct(Product p) {
		// TODO Auto-generated method stub
		if(prodotti.contains(p)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		for(Product p : prodotti) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}
