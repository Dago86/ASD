package generics;

import generics.Colore.Color;

public class ProvaCoppiaColore {

	public static void main(String[] args) {
		CoppiaColorata <Aereo, Palla> cc = new CoppiaColorata(new Aereo(), new Palla());
		cc.coloraTutti(Color.BLUE);
		System.out.println(cc.getColorCoppia());
	}

}
