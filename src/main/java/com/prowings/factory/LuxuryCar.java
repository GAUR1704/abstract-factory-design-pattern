package com.prowings.factory;

public class LuxuryCar extends Car{

	 public LuxuryCar(Location location)
	  {
	    super(CarType.LUXURY, location);
	    construct();
	  }

	@Override
	protected void construct() {
		System.out.println("Building luxury car!!!");
		System.out.println("installing ventilated seats!!!");
		//add luxury accessories
	}

}
