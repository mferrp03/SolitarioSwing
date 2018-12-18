import javax.swing.ImageIcon;

public class Carta {
	char[] carta;
	String ruta;
	Carta(char numero, char palo,String ruta){
		carta = new char[2];
		carta[0] = numero;
		carta[1] = palo;
		this.ruta = ruta;
	}
	String getRuta(){
		
		return ruta;
	}
	char getPalo(){
		char palo;
		palo = carta[1];
		return palo;
	}
	char getNum() {
		char num;
		num = carta[0];
		return num;
	}
	boolean existeCarta() {
		boolean existe = false;
		if ((this.getPalo()=='C'||this.getPalo()=='H'||this.getPalo()=='D'||this.getPalo()=='S') && (this.getNum()=='A'||this.getNum()=='2'||this.getNum()=='3'||this.getNum()=='4'||this.getNum()=='5'||this.getNum()=='6'||this.getNum()=='7'||this.getNum()=='8'||this.getNum()=='9'||this.getNum()=='T'||this.getNum()=='J'||this.getNum()=='Q'||this.getNum()=='K')) {
			existe = true;
		}
		return existe;
	}
	boolean mismoPalo(Carta carta) {
		boolean palo = false;
		if(this.getPalo()==carta.getPalo()) {
			palo = true;
		}
		return palo;
	}
	int tamanoNum() {
		int posicion = -1;
		boolean encontrar = false;
		int i = 0;
		char[] numeros = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
		do {
			if(this.getNum()==numeros[i]) {
				posicion = i;
				encontrar = true;
			}
			else {
				i++;
			}
		}while(!encontrar && i<= 12);
		
		return posicion;
	}
	boolean distintoColor(Carta carta) {
		boolean color = false;
		if(((this.getPalo() == 'D' || this.getPalo() == 'H') && (carta.getPalo() == 'C' || carta.getPalo() == 'S')) ||((this.getPalo() == 'C' || this.getPalo() == 'S') &&  (carta.getPalo() == 'D' || carta.getPalo() == 'H')) ){
			color = true;
		}
		
		return color;
	}
	boolean movimientoPila(Carta carta) {
		boolean valido = false;
		if(this.tamanoNum() == carta.tamanoNum()-1 && this.distintoColor(carta)) {
			valido = true;
		}	
		return valido;
	}
	boolean movimientoAMonton(Carta carta) {
		boolean valido = false;		
		if(this.mismoPalo(carta)) {
			if(this.tamanoNum() == carta.tamanoNum()+1) {
				valido = true;
			}	
		}
		return valido;
	}
	boolean mismoNumero(Carta carta) {
		boolean num = false;
		if(this.getNum()==carta.getNum()) {
			num = true;
		}
		return num;
	}
	

}