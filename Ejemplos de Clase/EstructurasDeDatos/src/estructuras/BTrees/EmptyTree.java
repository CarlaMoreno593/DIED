package estructuras.BTrees;

import java.util.ArrayList;
import java.util.List;

public class EmptyTree<E> extends Tree<E>{
	
	//El �rbol vac�o es un arbol con valor nulo
	public EmptyTree() {
		
		this.valor=null;
	
	}
	
	
	
	@Override
	public boolean esVacio() {

		return true;
		
	}

	//Un �rbol vac�o solo puede ser igual a otro �rbol vac�o
	@Override
	public boolean equals(Tree<E> unArbol) {
		
		return unArbol.esVacio();
		
	}

	@Override
	public Tree<E> getIzquierdo() {
		
		return null;
	}

	@Override
	public Tree<E> getDerecho() {
		
		return null;
		
	}
	
	//No se puede agregar hijos a un arbol vac�o
	//por eso no se define el cuerpo del m�todo
	@Override
	public void agregarIzquierdo(Tree<E> a) {
		
	}

	@Override
	public void agregarDerecho(Tree<E> a) {
		
		
	}

	@Override
	public E getValor() {
		
		return null;
		
	}

	@Override
	public boolean contains(E v) {
		
		return false;
		
	}

	@Override
	public Integer profundidad() {
		
		return 0;
		
	}

	
	//Como es un �rbol vac�o, siempre va a retornar una lista vac�a
	@Override
	public List<E> preOrden() {
		
		return new ArrayList<E>();
		
	}

	@Override
	public List<E> inOrden() {
		
		return new ArrayList<E>();
		
	}

	@Override
	public List<E> postOrden() {
		
		return new ArrayList<E>();
	
	}



	@Override
	public List<E> porNivel() {
		
		return new ArrayList<E>();

	}

}
