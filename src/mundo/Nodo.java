package mundo;

public class Nodo {

	// Atributos
	private Nodo izq, der;
	private Info info;

	public Nodo() {
		izq = null;
		der = null;
		info = null;
	}

	public Nodo(Info info, Nodo izq, Nodo der) {
		this.info = info;
		this.izq = izq;
		this.der = der;
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

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

}
