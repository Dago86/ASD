package listabidirezionale;
/** Date due Liste che contengono dei decimilari, creare una terza Lista che è la somma (le Liste quindi vanno calcolati come
se fossero interi e non si possono usare metodi specifici Java) **/
public class Esercizio4_3 {

	public static void main(String[] args) {
		List L = new List();
		Pos p1 = L.insert(null, 9);
		Pos p2 = L.insert(p1, 9);
		
		List M = new List();
		Pos p3 = M.insert(null, 9);
		Pos p4 = M.insert(p3, 9);
		
		List N = somma(L,M);
		
		System.out.println(N.read(N.head()));
		System.out.println(N.read(N.next(N.head())));
		System.out.println(N.read(N.next(N.next(N.head()))));
		

	}
	
	public static List somma (List L, List M) {
		List N = new List();
		Pos pos = L.head();
		Pos pos_2 = M.head();
		int value = 0;
		while(!L.finished(pos) && !M.finished(pos_2)) {
			value = value + (int) L.read(pos) + (int ) M.read(pos_2);
			if (value>= 10) {
				value = value - 10;
				N.insert(N.head(), value);
				value = 1;
			}
			else {
				N.insert(N.head(), value);
				
			}
			
			pos = L.next(pos);
			pos_2 =M.next(pos_2);
			
		}
		if(value != 0) N.insert(N.head(), value);
		
		return N;
	}

}
