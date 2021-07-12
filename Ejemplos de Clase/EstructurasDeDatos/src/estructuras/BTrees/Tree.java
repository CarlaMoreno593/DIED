package estructuras.BTrees;

import java.util.List;

public abstract class Tree<E> {
	
	protected E valor;
	
	//Métodos que ambos tipos de árboles (Vacío y Binario) implementarán

	public abstract boolean esVacio();
	public abstract boolean equals(Tree<E> unArbol);
	
	public abstract Tree<E> getIzquierdo();
	public abstract Tree<E> getDerecho();
	
	public abstract void agregarIzquierdo(Tree<E> a);
	public abstract void agregarDerecho(Tree<E> a);
	

	public abstract E getValor();
	public abstract boolean contains(E v);
	

	public abstract Integer profundidad();
	
	public abstract List<E> preOrden();
	public abstract List<E> inOrden();
	public abstract List<E> postOrden();
	public abstract List<E> porNivel();
	
}
