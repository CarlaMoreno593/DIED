package died.estructuras.arboles;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda<E extends Comparable<E>> extends Arbol<E> {

	protected Arbol<E> izquierdo;
	protected Arbol<E> derecho;
	
	public ArbolBinarioBusqueda(){
		this.valor=null;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e,Arbol<E> i,Arbol<E> d){
		this.valor=e;
		this.izquierdo=i;
		this.derecho=d;
	}
	
	@Override
	public List<E> preOrden() {
		List<E> lista = new ArrayList<E>();
		lista.add(this.valor);
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> inOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		lista.add(this.valor);
		return lista;

	}
	@Override
	public boolean esVacio() {
		return false;
	}
        
	@Override
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol<E> izquierdo() {
		return this.izquierdo;
	}
	
	@Override
	public Arbol<E> derecho() {
		return this.derecho;
	}

	//Inserta un elemento según el valor de la raíz
	@Override
	public void agregar(E a) {
		if(this.valor.compareTo(a)<1) {
			if (this.derecho.esVacio()) this.derecho = new ArbolBinarioBusqueda<E>(a);
			else this.derecho.agregar(a);
		}else {
			if (this.izquierdo.esVacio()) this.izquierdo= new ArbolBinarioBusqueda<E>(a);
			else this.izquierdo.agregar(a);
		}
	}
	
	//b) Método recursivo que retorna true si un árbol binario es idéntico a un recibido como parámetro.
	@Override
	public boolean equals(Arbol<E> unArbol) {
		
		return this.valor.equals(unArbol.valor()) && 
				this.izquierdo.equals(unArbol.izquierdo()) && 
				this.derecho.equals(unArbol.derecho());
	}

	//a) Retorna true si un elemento existe en el árbol.
	@Override
	public boolean contiene(E unValor) {
		
		int comparacion = this.valor.compareTo(unValor);
		
		if(comparacion==0) {
			
			return true;
		
		}
		else {
			if(comparacion<1) {
				//Quiere decir que valor es MENOR que unValor, por lo que si no soy yo, está en mi arbol DERECHO
				return this.derecho.contiene(unValor);
			
			}
			else {
				
				//Si el valor es MENOR que yo, entonces posiblemente esté en IZQUIERDO
				return this.izquierdo.contiene(unValor);
				
			}
		}

	}
	
	//c)método recursivo altura de un árbol. La altura de la raíz siempre es 0.
	@Override
	public Integer altura() {
		
		//Árbol vacío ->  Altura = 0
		//Árbol con solo raíz -> Altura = 0;
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			
			return 0;
			
		}
		
		//Árbol con al menos 1 hijo
		//Altura del padre + 1
		return 1 + Math.max(izquierdo.altura(), derecho.altura());
		
		
	}
	
	//d) método recursivo que retorna la profundidad de un árbol. La profundidad de la raíz siempre es 1
	@Override
	public Integer profundidad() {
		
		//Árbol vacío ->  Altura = 0
		//Árbol con solo raíz -> Altura = 1;
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			
			return 1;
			
		}
		
		//Árbol con al menos 1 hijo
		//Altura del padre + 1
		return 1 + Math.max(izquierdo.altura(), derecho.altura());
		
		
	}
	
	//e)método recursivo que cuente las hojas de un árbol binario. Un nodo hoja es aquel nodo cuyos 
	//hijos son vacíos.
	@Override
	public Integer cuentaHojas() {
		
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			
			return 1;
			
		}
		else {
			
			return this.izquierdo.cuentaHojas() + this.derecho.cuentaHojas();
		
		}
	}

	
	//f) método que determina el número de nodos que se encuentran en un nivel N de un árbol.
	@Override
	public Integer cuentaNodosDeNivel(int nivel) {
		
		//Si el nivel es cero, tengo 1 nodo-> la RAÍZ
		//Si el mensaje llega a ArbolVacio, va a retornar 0, independientemente de nivel. 
		if(nivel==0) {
			return 1;
		}
		else {
		
			//Decremento en 1 el nivel, y retorno la suma de los nodos en nivel-1 de cada subarbol.
			return this.izquierdo.cuentaNodosDeNivel(nivel-1)+this.derecho.cuentaNodosDeNivel(nivel-1);
		
		}
		
		
	}

	
	//h)  método que determina si el árbol binario es completo. 
	//Diferencia de altura entre izquierdo y derecho es 1.
	@Override
	public boolean esCompleto() {
		// TODO Auto-generated method stub
		return false;
	}

	//g) método que determina si el árbol binario es lleno. 
	// Un árbol binario de nivel N es lleno cuando el máximo número de nodos permitidos en cada uno de los niveles.
	@Override
	public boolean esLleno() {
		
		//Arbol vacío NO ES LLENO.
		//Raíz es llena
		if(this.izquierdo.esVacio() && this.derecho.esVacio()) {
			
			return true;
		
		}
		else {
			
			return this.izquierdo.esLleno() && this.derecho.esLleno();
			
		}

	}

	@Override
	public Arbol<E> espejar() {
		// TODO Auto-generated method stub
		return null;
	}

	//TODO Implementar recorrido por nivel con pila o cola, no recuerdo cual era
	
}
