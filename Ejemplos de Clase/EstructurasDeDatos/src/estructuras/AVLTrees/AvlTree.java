package estructuras.AVLTrees;

import java.util.List;

public class AvlTree extends Tree{
	
	
	public AvlTree() {
		
		this.valor=null;
		
	}
	
	//Es un metodo recursivo
	@Override
	public void insertar(Comparable x, AvlNode nodo) {

	
		if(nodo==null) {
			
			//Creo el nodo nuevo.
			nodo=new AvlNode(x, null, null);
		
		}
		else {
			
			//Si el valor x que quiero insertar es menor que el 
			//valor del nodo, lo inserto a la izquierda del nodo
			if(x.compareTo(nodo.valor)<0) {
				
				//Inserto a la izquierda
				
			}
		}
		
	}
	
	
}
