package minalivgame;

public class Node {
    private int dato;
    private Node puntero, arriba, abajo, izq, der;
    
    public Node(){
     this.dato = 0;
    }
    
    public Node(Node head){
        this.dato = -1;
        this.puntero = head;
    }
    
    public Node(int dato){
        this.dato = dato;
    }
     
    public void setDato(int dato){
        this.dato = dato;
    }
    
    public int getDato(){
        return this.dato;
    }
    
    public void setPuntero(Node puntero){
        this.puntero = puntero;
    }
    
    public Node getPuntero(){
        return this.puntero;
    }

	public Node getArriba() {
		return arriba;
	}

	public void setArriba(Node arriba) {
		this.arriba = arriba;
	}

	public Node getAbajo() {
		return abajo;
	}

	public void setAbajo(Node abajo) {
		this.abajo = abajo;
	}

	public Node getIzq() {
		return izq;
	}

	public void setIzq(Node izq) {
		this.izq = izq;
	}

	public Node getDer() {
		return der;
	}

	public void setDer(Node der) {
		this.der = der;
	}
    
}
