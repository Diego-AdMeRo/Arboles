package mundo;

public class Recorridos {

	public static void preOrden(Nodo root) {
		System.out.print(root.getInfo().getDato() + "\t");
		if (root.getIzq() != null)
			preOrden(root.getIzq());
		if (root.getDer() != null)
			preOrden(root.getDer());
	}

	public static void posOrden(Nodo root) {
		if (root.getIzq() != null)
			posOrden(root.getIzq());
		if (root.getDer() != null)
			posOrden(root.getDer());
		System.out.print(root.getInfo().getDato() + "\t");
	}

	public static void inOrden(Nodo root) {
		if (root.getIzq() != null)
			inOrden(root.getIzq());
		System.out.print(root.getInfo().getDato() + "\t");
		if (root.getDer() != null)
			inOrden(root.getDer());
	}

	public static void porNivel(Nodo root) {
		if (root.getIzq() != null)
			System.out.print(root.getIzq().getInfo().getDato() + "\t");
		if (root.getDer() != null)
			System.out.print(root.getDer().getInfo().getDato() + "\t");
		if (root.getIzq() != null)
			porNivel(root.getIzq());
		if (root.getDer() != null)
			porNivel(root.getDer());

	}

	public static int altura(Nodo root) {
		int mayor = 0, auxD = 0, auxI = 0;
		if (root.getIzq() != null)
			auxI = altura(root.getIzq());
		if (root.getDer() != null)
			auxD = altura(root.getDer());
		if (mayor < auxI)
			mayor = auxI;
		if (mayor < auxD)
			mayor = auxD;
		return mayor + 1;
	}
}
