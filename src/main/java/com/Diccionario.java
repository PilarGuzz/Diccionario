package main.java.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Diccionario {
	
	private Map<String, List<String>> diccionario = new HashMap<>();
	
	public Diccionario() {
		
	}
	
	public void addPalabra(String palabra, String def ){
		
		if(!diccionario.containsKey(palabra)){
			List<String> significado = new ArrayList<>();
			significado.add(def);
			diccionario.put(palabra, significado);
			
		}else{
			diccionario.get(palabra).add(def);
		};	

	}
	
	public List<String> buscarPalabra(String palabra) {
		List<String> res = null;
		if(diccionario.containsKey(palabra)){
			res = diccionario.get(palabra);
			return res;
		}else{
			return res;
		}
		
	}
	
	public void borrarPalabra(String palabra) {
		
		if(diccionario.containsKey(palabra)){
			diccionario.remove(palabra);
		};
		
	}
	
	public List<String> palabrasEmpiezanPor(String letras) {
		
		diccionario.keySet();
		
		return null;
	}
	

}
