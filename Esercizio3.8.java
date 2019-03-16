package listabidirezionale;

public class OrdinaDispari {

	public static void main(String[] args) {
		List L = new List();
		Pos p1 = L.insert(null, 3);
		Pos p2 = L.insert(p1, 7);
		Pos p3 = L.insert(p2, 8);
		Pos p4 = L.insert(p3, 1);
		Pos p5 = L.insert(p4, 4);
		
		ordinaDispari(L);
		
		Pos p = L.head();
		while(L.finished(p) != false) {
			System.out.println(L.read(p));	
			p = L.next(p);
		}
		
		System.out.println(L.read(p3));

	}
	
	
	public static void ordinaDispari(List L) {
		Pos p = L.head();
		Pos p1 = L.next(p);
		int tmp;
		while (p1!= null) {
		 if( (int) L.read(p)%2 != 0 && (int) L.read(L.next(p))%2 == 0 ) {
			 tmp = (int) L.read(p1);
			 L.write(p1, L.read(p));
			 L.write(p, tmp); 
		 }
		 p = L.next(p);
		 p1 = L.next(p1);
		}
	}
	
	

}
