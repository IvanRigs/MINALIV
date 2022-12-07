package minalivgame;

public class Structure {

	private Node head, p, q, r;
	private int columnas, filas;

	public void listaBidimensional(int filas, int columnas) {
		this.columnas = columnas;
		this.filas = filas;
		for (int i = 0; i < filas; i++) {
			for (int z = 0; z < columnas; z++) {
				p = new Node();
				if (z == 0) {
					head = (head == null) ? p : head;
					q = p;
				} else {
					p.setIzq(q);
					q.setDer(p);
					q = p;
				}

				if (i == 0) {
					q = p;
				} else {
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
		System.out.println();
	}

	public void clsList() {
		if (head != null) {
			q = head;
			r = head;
			for (int i = 0; i < filas; i++) {
				for (int z = 0; z < columnas; z++) {
					if (q.getDato() != 0) {
						q.setDato(0);
					}

					q = q.getDer();

				}
				r = r.getAbajo();
				q = r;
			}
			verListaBidimensional();
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

	public boolean verificarEmpate() {
		if (head != null) {

			p = head;

			while (p.getDer() != null) {
				if (p.getDato() == 0) {
					return false;
				}
				p = p.getDer();
			}
			if (p.getDato() == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean colocarDato(int turn, int fila) {

		if (head != null) {
			q = head;
			for (int i = 1; i < fila; i++) {
				q = q.getDer();
			}

			if (q.getDato() != 0) {
				return false;
			}

			while (q.getDato() == 0 && q.getAbajo() != null && q.getAbajo().getDato() == 0) {
				q = q.getAbajo();
			}

			if (q.getDato() == 0) {
				q.setDato(turn);
				//verListaBidimensional();
				return true;
			}
		}

		return false;
	}

	public int indX(int fila) {
		int x = 0;
		if (head != null) {
			q = head;
			for (int i = 1; i < fila; i++) {
				q = q.getDer();
			}

			if (q.getDato() != 0) {
				return -1;
			}

			while (q.getDato() == 0 && q.getAbajo() != null && q.getAbajo().getDato() == 0) {
				q = q.getAbajo();
				x++;
			}

			if (q.getDato() == 0) {
				return x;
			}
		}

		return -1;
	}

	public boolean emptyList() {
		if (head != null) {
			q = head;
			r = head;
			for (int i = 0; i < filas; i++) {
				for (int z = 0; z < columnas; z++) {
					if (q.getDato() != 0) {
						return false;
					}

					q = q.getDer();

				}
				r = r.getAbajo();
				q = r;
			}
		}
		return true;
	}

	public boolean check(int fila, int turn) {

		// posicionar el nodo
		if (head != null) {
			q = head;
			for (int i = 1; i < fila; i++) {
				q = q.getDer();
			}

			while (q.getDato() != turn && q.getAbajo() != null) {
				q = q.getAbajo();
			}

			r = q;

			if (q.getDato() != 0) {
				int cont = 0;

				// fila
				while (q.getIzq() != null && q.getDato() == turn && q.getIzq().getDato() == turn) {
					q = q.getIzq();
				}

				while (q.getDer() != null && q.getDato() == turn && q.getDer().getDato() == turn) {
					cont++;
					q = q.getDer();
				}

				if (cont >= 3) {
					return true;
				}

				// columna
				cont = 0;
				q = r;

				while (q.getAbajo() != null && q.getAbajo().getDato() == turn) {
					q = q.getAbajo();
					cont++;
				}

				if (cont >= 3) {
					return true;
				}

				// diagonal izq-der
				cont = 0;
				q = r;
				while (q.getAbajo() != null && q.getIzq() != null && q.getAbajo().getIzq().getDato() == turn) {
					q = q.getAbajo().getIzq();
				}

				while (q.getArriba() != null && q.getDer() != null && q.getArriba().getDer().getDato() == turn) {
					q = q.getArriba().getDer();
					cont++;
				}

				if (cont >= 3) {
					return true;
				}

				// diagonal der-izq
				cont = 0;
				q = r;
				while (q.getAbajo() != null && q.getDer() != null && q.getAbajo().getDer().getDato() == turn) {
					q = q.getAbajo().getDer();
				}

				while (q.getArriba() != null && q.getIzq() != null && q.getArriba().getIzq().getDato() == turn) {
					q = q.getArriba().getIzq();
					cont++;
				}

				if (cont >= 3) {
					return true;
				}
			}
		}

		return false;
	}

	public void listaSencilla(int dato) {
		p = new Node(dato);
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

	public int calcularTamano() {
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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getP() {
		return p;
	}

	public void setP(Node p) {
		this.p = p;
	}

	public Node getQ() {
		return q;
	}

	public void setQ(Node q) {
		this.q = q;
	}

	public Node getR() {
		return r;
	}

	public void setR(Node r) {
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
