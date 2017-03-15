package it.polito.tdp.alien;

import java.util.Map;
import java.util.TreeMap;

public class AlienDictionary {

	private Map<String, Parola> mappaParole= new TreeMap<String, Parola>();
	
	
	public void addWord(String alienWord, String translation){
		Parola temp= new Parola(alienWord, translation);
		if(mappaParole.containsKey(alienWord)){
			mappaParole.get(alienWord).setTraslation(translation);
			
		}
		else{
			mappaParole.put(alienWord, temp);
		}
		
	}


	public String translateWord(String text) {
		return mappaParole.get(text).compare(text);
	}
	

}
