package estructuras.NTrees;

import java.util.ArrayList;
import java.util.List;

public class NTree<T> {
	
	//Un arbol tiene un nodo ra�z con su lista de hijos o descendientes
	private T valor;
	//Los hijos son �rboles -> Definici�n recursiva
	private List<NTree<T>> hijos = new ArrayList<NTree<T>>();
	
	//Crea un �rbol Vac�o
	public NTree() {
		
	}
	
	//Crea un �rbol con su nodo ra�z nom�s. Los hijos deben agregarse
	public NTree(T v) {
		
		this();
		this.valor = v;
		
	}
	
	
	//Agrego un hijo a la ra�z
	public void agregarValor(T v) {
		
		this.hijos.add(new NTree<T>(v));
		
	}
	
	//Agrego un nodo a un nodo espec�fico.
	public void agregarEn(T nodoDestino, T v) {
		
		//Si el nodoDestino soy yo, lo agrego a mis descendientes
		if(this.valor.equals(v)) {
			
			this.agregarValor(v);
			
		}
		else {
			//Busco en mis descendientes al nodoDestino
			//Llamo de forma recursiva al m�todo, ya que los descendientes
			//son �rboles
			for(NTree<T> hijo : this.hijos) {
				
				hijo.agregarEn(nodoDestino, v);
				//No va a ejecutar sobre todos los hijos salvo que no exista
				//el nodoDestino o si es un nodo hoja de m�s a la derecha
				
			}
			
		}
		
	}
	
	public List<T> listarNodos(){
		
		List<T> nodos = new ArrayList<T>();
		
		//Agrego mi propio valor
		nodos.add(this.valor);
		
		for(NTree<T> hijo : this.hijos) {
			
			//Llamo recursivamente a cada hijo para que retorne su lista
			//de nodos, y con addAll concateno todos los nodos de forma plana
			nodos.addAll(hijo.listarNodos());
			
		}
		
		return nodos;
	}
	
	public boolean contains(T t) {
		
		//Si yo soy igual a t, contiene en el arbol a t. Retorno true
		if(this.valor.equals(t)) {
			
			return true;
			
		}
		else {
			
			//Busco en mis descendientes al nodo de valor t
			//Llamo de forma recursiva al m�todo, ya que los descendientes
			//son �rboles
			for(NTree<T> hijo : this.hijos) {
				
				//Debe agregar el if, porque si no, continuar�a ejecutando
				//incluso cuando lo haya encontrado.
				//Tampoco puedo retornar directamente lo que 
				//retorne contains, ya que acabar�a el m�todo antes de probar
				//con los otros nodos hijos
				if(hijo.contains(t)) return true;
								
			}
			
		}
		
		return false;
		
	}
}
