package listabidirezionale;
/** Data una Lista di interi, crearne una seconda che abbia gli elementi della prima lista esclusi i valori doppi **/
public class Esercizio4_2Epurazione {

	public static void main(String[] args) {
		List L = new List();
		Pos p1 = L.insert(null, 1);
		Pos p2 = L.insert(p1, 2);
		Pos p3 = L.insert(p2, 3);
		Pos p4 = L.insert(p3, 2);
		Pos pos = L.head();
		List M = new List();
		System.out.println(L.finished(pos));
		epurazione(pos, L, M);	
	
	
	}
	
	
	public static void epurazione(Pos pos, List L, List M) {
		if (!L.finished(pos)) {
			int conta = 0;
			
			Pos pos_2 =  L.head();
			while(!L.finished(pos_2)) {
				if (L.read(pos) == L.read(pos_2))
				conta ++;
				
				pos_2 = L.next(pos_2);
			}
			if (conta != 2) 
			M.insert(M.head(), (int) L.read(pos));
			epurazione(L.next(pos), L, M);
		}
		
	
	
	
	
	

	}

}
