package com.objectCreationprogram; 
  class Fan {
	 //properties or attributes or Data Members
		int no_of_wings;
		int cost;
		String color;
		String brand;
		
		public void rotate() {
			System.out.println(color+ " color ,"+brand+ " brand,"+no_of_wings+ " wingded fan, "+"of rs "+cost+ " is rotating");
		}
		public void blow_Air()
		{
			System.out.println(color+ " fan is blowing air");
		}
	}

	


