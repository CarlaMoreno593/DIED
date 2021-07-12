package died.estructuras.arboles;

import java.util.ArrayList;
import java.util.List;

public class ArbolVacio<E extends Comparable<E>> extends Arbol<E> {

	public ArbolVacio(){
		this.valor=null;
	}
	
	@Override
	public List<E> preOrden() {
		return new ArrayList<E>();
	}

	@Override
	public List<E> inOrden() {
		return new ArrayList<E>();
	}

	@Override
	public List<E> posOrden() {
		return new ArrayList<E>();
	}

	@Override
	public boolean esVacio() {
		return true;
	}

	@Override
	public E valor() {
		return null;
	}

	@Override
	public Arbol<E> izquierdo() {
		return null;
	}

	@Override
	public Arbol<E> derecho() {
		return null;
	}

	@Override
	public boolean contiene(E unValor) {
		return false;
	}

	@Override
	public boolean equals(Arbol<E> unArbol) {
		
		//Un árbol vacío es igual a otro árbol solo si ese arbol es vacío
		return unArbol.esVacio();
	
	}

	@Override
	public void agregar(E a) {
		
		//No tiene que hacer nada, ya que dejaría de ser ArbolVacio
		
	}

	@Override
	public Integer altura() {
		return 0;
	}

	@Override
	public Integer profundidad() {
	
		return 0;
	}

	@Override
	public Integer cuentaHojas() {
		// Árbol vacío NO tiene NODOS, por lo tanto, tampoco tiene HOJAS
		return 0;
	}

	@Override
	public Integer cuentaNodosDeNivel(int nivel) {
		// No tiene nodos en ningún nivel
		return 0;
	}

	@Override
	public boolean esCompleto() {
		//Arbol vacio no es completo
		return false;
	}

	@Override
	public boolean esLleno() {
		//Arbol vacio no es lleno
		return false;
	}

	@Override
	public Arbol<E> espejar() {
		// TODO Auto-generated method stub
		return null;
	}

	



}
