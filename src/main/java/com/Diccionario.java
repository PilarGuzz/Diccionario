package main.java.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {
	
	private Map<String, Set<String>> diccionario = new HashMap<>();
	
	
	public Diccionario() {
		
	}
	
	
	
	public void addPalabra(String palabra, String def ){
		
		if(!diccionario.containsKey(palabra)){
			Set<String> significado = new HashSet<String>();
			significado.add(def);
			diccionario.put(palabra, significado);
			
		}else{
			diccionario.get(palabra).add(def);
		
		}	
	}
	
	
	
	public Set<String> buscarPalabra(String palabra) {
	
		return diccionario.get(palabra);
	}
	
	
	
	public void borrarPalabra(String palabra) {
		
		diccionario.remove(palabra);
		
	}
	
	public void eliminarSignificado(String palabra, String def) {
		diccionario.remove(palabra, def);
	}
	
	
	
	public List<String> palabrasEmpiezanPor(String letras) {
		
		List<String> palabras = new ArrayList<String>();
			
		for(String clave: diccionario.keySet()) {
			if(clave.startsWith(letras)) {
				palabras.add(clave);
			}
			
		}
		
		Arrays.sort(palabras.toArray());
		return palabras;
	}
	

}
