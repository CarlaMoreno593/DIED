public List<T> recorridoTopologico(){

	 List<T> resultado = new ArrayList<T>();
	 Map<Vertice<T>,Integer> gradosVertice = new HashMap<Vertice<T>,Integer>();

	 for(Vertice<T> vert : this.vertices){

		gradosVertice.put(vert, this.gradoEntrada(vert));
	 }

	 while(!gradosVertice.isEmpty()){

		List<Vertice<T>> nodosSinEntradas = gradosVertice.entrySet().stream().filter( x -> x.getValue()==0).map( p -> p.getKey()).collect( Collectors.toList()); 

		if(nodosSinEntradas.isEmpty())

		System.out.println("TIENE CICLOS");

		for(Vertice<T> v : nodosSinEntradas){
			resultado.add(v.getValor());
			gradosVertice.remove(v);
			
			for(Vertice<T> ady: this.getAdyacentes(v)){
				gradosVertice.put(ady,gradosVertice.get(ady)-1);
			}
		}
	}

	System.out.println(resultado);

	return resultado;

}