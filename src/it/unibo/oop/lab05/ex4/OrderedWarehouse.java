package it.unibo.oop.lab05.ex4;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WareHouseImpl;
import jdk.management.jfr.SettingDescriptorInfo;

public class OrderedWarehouse extends WareHouseImpl{

	@Override
	public Set<Product> allProducts() {
		// TODO Auto-generated method stub
		
		return new TreeSet<Product>(super.allProducts());
	}
}
