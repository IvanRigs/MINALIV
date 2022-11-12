package conect;

public class Estructura {

	private Nodo head, p, q, r;
	private int columnas, filas;

	public void listaBidimensional(int filas, int columnas) {
		this.columnas = columnas;
		this.filas = filas;
		for (int i = 0; i < filas; i++) {
			for (int z = 0; z < columnas; z++) {
				p = new Nodo();
				if (z == 0) {
					head = (head == null) ? p : head;
					q = p;
				}else {
					p.setIzq(q);
					q.setDer(p);
					q = p;
				}
				
				if (i == 0) {
					q = p;					
				}else {
					p.setArriba(r);
					r.setAbajo(p);
					r = r.getDer();
				}
			}
			r = head;
			while (r.getAbajo() != null) {
				r = r.getAbajo();
			}
		}
	}
	
	
	
	public void verListaBidimensional() {
		if (head != null) {
			q = head;
			while (q != null) {
				p = q;
				while (p != null) {
					System.out.print(p.getDato());
					p = p.getDer();
				}
				q = q.getAbajo();
				System.out.println();
			}
		}
	}

	public void listaSencilla(int dato) {
		p = new Nodo(dato);
		if (head == null) {
			head = p;
		} else {
			q.setPuntero(p);
		}
		q = p;
	}

	public void verListaSencilla() {
		if (head != null) {
			p = head;
			while (p != null) {
				System.out.println(p.getDato() + ", ");
				p = p.getPuntero();
			}
		}
	}

	public boolean buscarDato(int dato) {
		if (head != null) {
			p = head;
			while (p != null) {
				if (p.getDato() == dato) {
					p = p.getPuntero();
					return true;
				}
				p = p.getPuntero();
			}
		}
		return false;
	}

	public int calcularTamaño() {
		int cont = 0;
		if (head != null) {
			p = head;
			while (p != null) {
				p = p.getPuntero();
				cont += 1;
			}
		}
		return cont;
	}

	public Nodo getHead() {
		return head;
	}

	public void setHead(Nodo head) {
		this.head = head;
	}

	public Nodo getP() {
		return p;
	}

	public void setP(Nodo p) {
		this.p = p;
	}

	public Nodo getQ() {
		return q;
	}

	public void setQ(Nodo q) {
		this.q = q;
	}

	public Nodo getR() {
		return r;
	}

	public void setR(Nodo r) {
		this.r = r;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}
	
}
