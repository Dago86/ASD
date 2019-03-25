package listabidirezionale;

public class rango {

	public static void main(String[] args) {
		List L = new List();
		Pos p0 = L.insert(null, 3);
		Pos p1 = L.insert(p0, 2);
		Pos p2 = L.insert(p1, 6);
		
		rango(L);
		System.out.println(L.read(L.head()));
		System.out.println(L.read(L.next(L.head())));
		System.out.println(L.read(L.next(L.next(L.head()))));
	}
	
	
	public static void rango(List L) {
		Pos p = L.tail();
		Pos p_2 = L.prev(p);
		while(L.prev(p)!=null) {
			int val = (int) L.read(p);
			System.out.println("Val vale" + val);
			while(p != p_2) {
				L.write(p_2, (int) L.read(p_2)+val);
				System.out.println("Scritto " + L.read(p_2) );
				p = L.prev(p);
			}
			p_2 = L.prev(p_2);
			
		}
		
	}

}
