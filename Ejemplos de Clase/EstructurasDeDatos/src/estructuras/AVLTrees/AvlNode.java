package estructuras.AVLTrees;

public class AvlNode {
	
	protected Integer valor;
	protected Integer factorEquilibrio;
	protected Comparable<Integer> comp;
	
	public AvlNode(Comparable<Integer> comp, Integer valor, Integer factorEquilibrio) {
		super();
		this.valor = valor;
		this.factorEquilibrio = factorEquilibrio;
		this.comp = comp;
	}
	
	
}
