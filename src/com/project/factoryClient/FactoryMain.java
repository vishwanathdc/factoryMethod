package com.project.factoryClient;
import com.project.factorySupplier.OS;
import com.project.factorySupplier.OSFactory;

public class FactoryMain {

	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		OS obj1 = osf.getInstance("ios");
		obj1.spec();
		OS obj2 = osf.getInstance("unix");
		obj2.spec();
	}

}
