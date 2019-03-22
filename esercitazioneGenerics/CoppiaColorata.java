package generics;

import generics.Colore.Color;

public class CoppiaColorata<A extends Colora, B extends Colora>  {

		private A primo;
		private B secondo;
		
		public CoppiaColorata(A primo, B secondo) {
			this.primo = primo;
			this.secondo = secondo;
		}
		
		public void coloraTutti(Color c) {
			primo.coloraOggetto(c);
			secondo.coloraOggetto(c);
		}
		
		public String getColorCoppia() {
			return (primo.getColor() + " " + secondo.getColor());
		}
		
	
	
		
}
