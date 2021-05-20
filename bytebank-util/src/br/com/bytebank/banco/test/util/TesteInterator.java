package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteInterator {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
		System.out.println("-----");
		
		Set<String> outrosNomes = new HashSet<>();
		outrosNomes.add("Super Mario");
		outrosNomes.add("Yoshi"); 
		outrosNomes.add("Donkey Kong"); 

		Iterator<String> outroIt = outrosNomes.iterator();

		while(outroIt.hasNext()) {
		  System.out.println(outroIt.next());
		}

	}

}
