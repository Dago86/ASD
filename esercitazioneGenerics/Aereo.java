package generics;

import generics.Colore.Color;

public class Aereo implements Colora {
	Color col;
	@Override
	public void coloraOggetto(Color c) {
		col = c;

	}
	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return col;
	}

}
