package estructuras.BTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTree<E> extends Tree<E> {

	//Un árbol binario tiene dos hijos y un valor
	//los hijos pueden o no ser vacíos
	protected Tree<E> izquierdo;
	protected Tree<E> derecho;
	
	//Por defecto, un arbol binario tiene un valor null
	//y dos arboles vacios como hijos
	public BTree() {
		
		this.valor=null;
		this.izquierdo = new EmptyTree<E>();
		this.derecho = new EmptyTree<E>();

	}
	
	//Un arbol con solo la raíz tiene un valor
	//y dos hijos arboles vacios
	public BTree(E v) {
		
		this();
		this.valor = v;
		
	}
	
	//Puedo crear un arbol binario con dos arboles predefinidos
	public BTree(E v, Tree<E> izq, Tree<E> der) {
		
		this.valor = v;
		this.izquierdo = izq;
		this.derecho = der;
		
	}
	
	
	//No es vacio, ni aunque tenga un valor nulo como valor
	@Override
	public boolean esVacio() {
		
		return false;
	
	}

	@Override
	public boolean equals(Tree<E> unArbol) {

		//Casi la misma lógica del contains, solo que debe
		//ser un &&
		
		//Dos arboles son iguales si:
		//Ambos son vacios
		//Tienen mismo valor, mismo arbol izquierdo y mismo arbol derecho
		return this.valor.equals(unArbol.getValor()) 
				&& this.izquierdo.equals(unArbol.getIzquierdo())
				&& this.derecho.equals(unArbol.getDerecho());
	
	}

	
	@Override
	public Tree<E> getIzquierdo() {
		
		return this.izquierdo;
		
	}

	@Override
	public Tree<E> getDerecho() {
		
		return this.derecho;
		
	}

	@Override
	public void agregarIzquierdo(Tree<E> a) {

		this.izquierdo = a;
		
	}

	@Override
	public void agregarDerecho(Tree<E> a) {

		this.derecho=a;
		
	}

	@Override
	public E getValor() {
		
		return this.valor;
		
	}

	@Override
	public boolean contains(E v) {

		//Si no lo tengo yo, reviso si lo tiene mi hijo izquierdo
		//Si lo tiene, retorna.
		//Si no lo tiene, revisa el derecho
		
		//Caso Base : Arbol Vacio = false
		return (this.valor.equals(v) || this.izquierdo.contains(v)
				|| this.derecho.contains(v));
		
	}

	//Profundidad = nivel de hoja mas largo. Nro. máximo de niveles
	@Override
	public Integer profundidad() {
		
		//Árbol vacío ->  profundidad = 0
		//Árbol con solo raíz -> profundidad = 0;
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			
			return 0;
			
		}
		
		//Árbol con al menos 1 hijo
		//Profundidad del padre + 1
		return 1 + Math.max(izquierdo.profundidad(), derecho.profundidad());
		
	}

	//En preorden-> RAIZ - IZQ - DER
	@Override
	public List<E> preOrden() {
		
		List<E> preorden = new ArrayList<E>();
		
		//Agrego raíz a lista
		preorden.add(this.valor);
		
		//Agrego en preorden, al hijo IZQ. Llamo recursivamente
		//Si IZQ es vacío, EmptyTree retornaba una lista vacía
		//es decir, no seguía recorriendo en los hijos porque no tiene
		//EmptyTree es la condición de corte
		preorden.addAll(this.izquierdo.preOrden());
		
		//Agrego en preorden al hijo DER. Llamo recursivamente
		preorden.addAll(this.derecho.preOrden());
		
		return preorden;
		
	}

	//En inorden -> IZQ - RAIZ - DER
	//Misma lógica de preorden, solo que cambia el orden
	//de las llamadas
	@Override
	public List<E> inOrden() {
		
		List<E> inorden = new ArrayList<E>();
		
		//Agrego en inorden, al hijo IZQ. Recursivo
		inorden.addAll(this.izquierdo.inOrden());
		
		//Agrego la raíz
		inorden.add(this.valor);
		
		//Agrego en inorden, al hijo DER. Recursivo
		inorden.addAll(this.derecho.inOrden());
		
		return inorden;
		
	}

	//En postorden -> IZQ - DER - RAIZ
	//Misma lógica que anteriores, solo que cambia orden de llamadas
	@Override
	public List<E> postOrden() {
		
		List<E> postorden = new ArrayList<E>();
		
		//Arbol izquierdo en postorden
		postorden.addAll(this.izquierdo.postOrden());
		
		//Arbol derecho en postorden
		postorden.addAll(this.derecho.postOrden());
		
		//Raiz
		postorden.add(this.valor);
		
		return postorden;
		
	}

	//Recorrido por anchura o por nivel-> COLA
	//TODO Recorrido por Nivel
	@Override
	public List<E> porNivel() {
		
//		Queue<E> cola = new LinkedList<E>();
//		ArrayList<E> lista = new ArrayList<E>();
//		
////		Agrego RAIZ a la cola
//		cola.add(valor);
//		
//		while(!cola.isEmpty()) {
//			
//			//Saco siguiente elemento a procesar.
//			lista.add(cola.remove());
//			
//			//Agrego hijos de ese elemento (Si no tiene, no agrega nada).
//			lista.addAll();
//			
//		}
//
//
//
//		
		
		return null;
	}
	
	

}
