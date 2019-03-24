package listabidirezionale;

public class CancellaAdiacenti {

	public static void main(String[] args) {
		/* Data una lista L interi si vuole modificarla cancellando tutti gli elementi adiacenti
 * che hanno valori consecutivi mantenendo l’ordine iniziale degli elementi (p.e. se l’ingresso è
 * 4,5,6,2,7,3,2,1,2,5 allora il risultato è 2,7,5). */
		List L = new List();
		Pos p= L.insert(null, 5);
		Pos p1=L.insert(p, 2);
		Pos p2=L.insert(p1, 1);
		Pos p3=L.insert(p2, 2);
		Pos p4 =L.insert(p3, 3);
		Pos p5 =L.insert(p4, 7);
		Pos p6 =L.insert(p5, 2);
		Pos p7 =L.insert(p6, 6);
		Pos p8 =L.insert(p7, 5);
		Pos p9 =L.insert(p8, 4);
		
		cancellaRic(L.head(),L);
	

	}

	private static void cancellaIt(Pos head, List L) {
		Pos p= head;
		while(!L.finished(L.next(p))){
			int tmp = 0;
			while((int) L.read(p)==1 +(int)L.read(L.next(p)) ||  (int) L.read(p)==  (int)L.read(L.next(p))-1){
				tmp= (int)L.read(p);
				System.out.println("Elimino " + L.read(p));
				L.remove(p);
				p = L.next(p);
			}
			
			if(tmp + 1 == (int)L.read(p) || tmp -1 == (int)L.read(p)) {
				System.out.println("Elimino " + L.read(p));
				L.remove(p);
			}
			p= L.next(p);
		}
		
	}
	
	
	private static void cancellaRic(Pos p,List L) {
		
		if(!L.finished(L.next(p))){
			int tmp = 0;
			while((int) L.read(p)==1 +(int)L.read(L.next(p)) ||  (int) L.read(p)==  (int)L.read(L.next(p))-1){
				tmp= (int)L.read(p);
				System.out.println("Elimino " + L.read(p));
				L.remove(p);
				p = L.next(p);
			}
			
			if(tmp + 1 == (int)L.read(p) || tmp -1 == (int)L.read(p)) {
				System.out.println("Elimino " + L.read(p));
				L.remove(p);
			}
			p= L.next(p);
			cancellaRic(p, L);
		}
		
	}
	
	
	
	
	

	
	
		
		
	}


