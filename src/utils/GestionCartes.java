package utils;

import java.util.*;

public class GestionCartes {
	
	public static <T> T extraire(List<T> liste) {
        Random rand = new Random();
        int index = rand.nextInt(liste.size());
        return liste.remove(index);
    }
	
	public static <T> T extraireIterator(List<T> liste) {
		Random rand = new Random();
		int index = rand.nextInt(liste.size());
		ListIterator<T> it = liste.listIterator();
		
		for (int i = 0; i <= index; i++) {
			it.next();
		}
		return it.previous();
	}
	
	public static <T> List<T> melanger(List<T> liste){
		List<T> listeMelange = new ArrayList<>();
		while(!liste.isEmpty()) {
			listeMelange.add(extraire(liste));
		}
		return listeMelange;
	}
	
	public static <T> boolean verifierMelange(List<T> l1, List<T> l2) {
		if(l1.size() != l2.size()) {
			return false;
		}
		for(T element : l1) {
			if(Collections.frequency(l1, element) != Collections.frequency(l2,element)) {
				return false;
			}
		}
		return true;
	} 
	
	public static <T> List<T> rassembler(List<T> liste){
		List<T> listeRassemble = new ArrayList<>();
		List<T> copie = new ArrayList<>(liste);
		
		while(!copie.isEmpty()) {
			T premier = copie.get(0);
			Iterator<T> it = copie.iterator();
			while(it.hasNext()) {
				T elem = it.next();
				if(elem.equals(premier)) {
					listeRassemble.add(elem);
					it.remove();
				}
			}
		}
		return listeRassemble;
	}
	
	public static <T> boolean verifierRassemblement(List<T> liste) {
		ListIterator<T> it1 = liste.listIterator();
		
		while(it1.hasNext()) {
			T currentElem = it1.next();
			if(it1.hasNext()) {
				T nextElem = liste.get(it1.nextIndex());
				if(!currentElem.equals(nextElem)) {
					ListIterator<T> it2 = liste.listIterator(it1.nextIndex());
					while(it2.hasNext()) {
						if(it2.next().equals(currentElem)) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

}
