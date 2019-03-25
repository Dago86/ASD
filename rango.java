package listabidirezionale;

public class rango {

	public static void main(String[] args) {
		List L = new List();
		Pos p0 = L.insert(null, 3);
		Pos p1 = L.insert(p0, 2);
		Pos p2 = L.insert(p1, 6);
		Pos p = L.tail();
		Pos p_2 = L.prev(p);
		rangoRic(p, p_2, L);
		System.out.println(L.read(L.head()));
		System.out.println(L.read(L.next(L.head())));
		System.out.println(L.read(L.next(L.next(L.head()))));
	}
	
	
	public static void rangoRic(Pos p1, Pos p2, List L) {
		if(L.prev(p1)!=null) {
			int val = (int) L.read(p1);
			L.write(p2, val+ (int) L.read(p2));
			rangoRic(p1 = L.prev(p1), p2 = L.prev(p2), L);
			
		}
	}

}
