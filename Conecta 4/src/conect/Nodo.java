package conect;

public class Nodo {
    private int dato;
    private Nodo puntero, arriba, abajo, izq, der;
    
    public Nodo(){
     this.dato = 0;
    }
    
    public Nodo(Nodo head){
        this.dato = -1;
        this.puntero = head;
    }
    
    public Nodo(int dato){
        this.dato = dato;
    }
     
    public void setDato(int dato){
        this.dato = dato;
    }
    
    public int getDato(){
        return this.dato;
    }
    
    public void setPuntero(Nodo puntero){
        this.puntero = puntero;
    }
    
    public Nodo getPuntero(){
        return this.puntero;
    }

	public Nodo getArriba() {
		return arriba;
	}

	public void setArriba(Nodo arriba) {
		this.arriba = arriba;
	}

	public Nodo getAbajo() {
		return abajo;
	}

	public void setAbajo(Nodo abajo) {
		this.abajo = abajo;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void setIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void setDer(Nodo der) {
		this.der = der;
	}
    
}
