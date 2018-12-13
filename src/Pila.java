import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Pila {
	ArrayList<Carta>pila;
	private int i = 0;
	Pila(){
		pila = new ArrayList<Carta>();
	}
	void addCarta(Carta carta) {
		pila.add(carta);
		i++;
	}
	boolean aniadirCarta(Carta carta) {
		boolean add = false;
		if(i==0) {
			pila.add(carta);
			i++;
			add = true;
		}
		else if(pila.get(i-1).mismoNumero(carta) || pila.get(i-1).mismoPalo(carta)) {
			add = true;
			pila.add(carta);
			i++;
		}
		return add;
	}
	void eliminarCarta() {
		pila.remove(i-1);
		i--;
	}
	int numCartas() {
		return i;
	}
	Carta getCarta() {
		return pila.get(i-1);
	}
	void barajar() {
		Collections.shuffle(pila);
	}
}

