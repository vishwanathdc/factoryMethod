package com.project.factorySupplier;

import com.project.factorySupplier.OS;
import com.project.factorySupplier.Unix;
import com.project.factorySupplier.Windows;
import com.project.factorySupplier.IOS;

public class OSFactory {
	public OS getInstance(String str) {
		if(str.equals("windows")) return new Windows();
		else if(str.equals("unix")) return new Unix();
		else if(str.equals("ios")) return new IOS();
		return null;
	}
}
