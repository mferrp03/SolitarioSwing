import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Pila {
	ArrayList<Carta>pila;
	
	private int corto = 0;
	private int largo = 0;
	private int i = 0;
	Pila(){
		pila = new ArrayList<Carta>();
		
	}
	
	void setSaltos(int n) {
		this.corto = n-1;
		this.largo = n-3;
	}
	void cambiarCorto(int n) {
		this.corto-=n;
	}
	void cambiarLargo(int n) {
		this.largo-=n;
	}
	int getCorto() {
		return this.corto;
	}
	int getLargo() {
		return this.largo;
	}

	
	boolean saltoPosible(Pila pila) {
		boolean salto = false;
		if(this.getCarta().mismoNumero(pila.getCarta()) || this.getCarta().mismoPalo(pila.getCarta() )){
			salto = true;
		}
		return salto;
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
	Carta getCartaN(int n) {
		return pila.get(n);
	}
	void barajar() {
		Collections.shuffle(pila);
	}
	
}

