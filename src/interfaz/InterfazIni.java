package interfaz;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.*;

public class InterfazIni {

	public static void main(String[] args) {
		ArrayList<Nodo> array = new ArrayList<Nodo>();
		Nodo aux = new Nodo(null, null, null);
		Scanner lectorScanner = new Scanner(System.in);
		
		System.out.println("Ingrese el Limite Inferior");
		int limiteInicial= lectorScanner.nextInt();
		
		System.out.println("Ingrese el Limite Superior");
		int limiteFinal = lectorScanner.nextInt();

		for (int i = limiteInicial, j=0; i <= limiteFinal; i++, j++) {
			array.add(new Nodo(new Info(i), null, null));
			//Impresión de Nodos creados
			System.out.print(array.get(j).getInfo().getDato() + "\t");
		}

		while (array.size() > 1) {
			aux.setInfo(new Info(array.get(0).getInfo().getDato() + array.get(1).getInfo().getDato()));
			aux.setIzq(array.get(0));
			array.remove(0);
			aux.setDer(array.get(0));
			array.remove(0);
			array.add(0, aux);
			aux = new Nodo(null, null, null);
		}
		
		System.out.println("PreOrden");
		Recorridos.preOrden(array.get(0));
		System.out.println("\nPosOrden");
		Recorridos.posOrden(array.get(0));
		System.out.println("\ninOrden");
		Recorridos.inOrden(array.get(0));
		System.out.println("\nRecorrido por Niveles");
		Recorridos.porNivel(array.get(0));
		System.out.println("\nNiveles = " + (Recorridos.altura(array.get(0)) - 1));

	}

}
