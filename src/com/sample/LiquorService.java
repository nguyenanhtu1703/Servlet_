package com.sample;

import java.util.ArrayList;
import java.util.List;

import com.sample.model.LiquorType;

public class LiquorService {
	public List getAvailableBrands(LiquorType type) {
		List brands = new ArrayList();
		
		if (type.equals(LiquorType.WINE)) {
			brands.add("Adrianna Vineyard");
			brands.add("J. P. Chenet");
		} else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");

        } else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");

        } else {
            brands.add("No Brand Available");
        }
		
		return brands;
	}
}
