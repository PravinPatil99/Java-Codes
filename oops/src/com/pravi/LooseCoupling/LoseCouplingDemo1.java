package com.pravi.LooseCoupling;

public class LoseCouplingDemo1 {

	public static void main(String[] args) 
	{
		Restuarant.acceptObject(new Tea());
		Restuarant.acceptObject(new Horliks());
		Restuarant.acceptObject(new Coffee());

	}

}
